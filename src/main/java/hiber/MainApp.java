package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        Map<User, Car> userCarMap = Map.of(
                new User("User1", "Lastname1", "user1@mail.ru"), new Car("Car1", 100),
                new User("User2", "Lastname2", "user2@mail.ru"), new Car("Car2", 200),
                new User("User3", "Lastname3", "user3@mail.ru"), new Car("Car3", 300),
                new User("User4", "Lastname4", "user4@mail.ru"), new Car("Car4", 400)
        );

        userCarMap.forEach((user, car) -> {
            user.setCar(car);
            userService.add(user);
        });

        for (User user : userService.listUsers()) {
            System.out.println(user + ", " + user.getCar());
        }

        String carName = "Car1";
        try {
            System.out.println(userService.getUserByCar(carName, 100));
        } catch (Exception e) {
            System.out.println("Пользователь с машиной " + carName + " не найден");
        }

        context.close();
    }
}
