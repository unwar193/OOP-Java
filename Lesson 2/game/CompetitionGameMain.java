package game;

public class CompetitionGameMain {

    public static void main(String[] args) {
        // Реализуем соревнования
        // Должны быть участники и препятствия
        // У участника есть параметры: возможности бега (длина), прыжка (высота), плавание (длина)
        // 3 типа препятствия: беговая дорожка, стена и бассейн
        // 3 типа участников: обычный, кот, читер
        // Обычный участник умеет все в зависимости от параметров
        // Кот не умеет плавать
        // Читер всегда преодолевает препятствия, какими бы они не были

        // CompetitionGameMain [Participant, Obstacle]
        // WallAdapter, RoadAdapter, ...

        // Wall(CanJump), Road(CanRun) ...]

        // AnotherSubSystem
        // WallCardAdapter(Wall) <-> Car
        // [WallAdapter(xxxx

        // Mouse
        // MouseBluetoothAdapter

        // Computer [Bluetooth, USB]


        Obstacle[] obstacles = createObstacles();
        Participant[] participants = createParticipants();
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                // participant.overcome(obstacle)
                // obstacle.pass(participant)
                boolean result = obstacle.pass(participant);
                if (result) {
                    System.out.println("Участник #" + participant.getName() + " преодолел препятствие");
                } else {
                    System.out.println("Участник #" + participant.getName() + " НЕ преодолел препятствие");
                }
            }
        }


        // Homework!!!
        // 0. Ознакомиться с кодом урока 2, подготовить вопросы к следующему уроку!
        // 1. Дописать адаптеры для бассейна
        // 2. *Придумать собственный тип препятствий и прикрутить его в проект по аналогии/

        // 3. *Есть интерфейс RoundHole - описание круглое отверстия (имеет радиус) double getRadius()
        // Есть интерфейс RoundPeg - описание круглого колышка (тоже есть радиус)
        // Есть класс RoundHoleMachine, у которой метод, принмает RoundPeg, возвращает RoundHole
        // Есть интерфейс SquarePeg - описание квадратного колышка (имеет длину стороны кварата)
        // Реализовать адаптер для SquarePeg в RoundHoleMachine
    }

    private static Obstacle[] createObstacles() {
        return new Obstacle[]{
                new WallObstacleAdapter(new Wall(40)),
                new RoadObstacleAdapter(new Road(100)),
                new RoadObstacleAdapter(new Road(45)),
                new PoolObstacleAdapter(new SwimmingPoll(20))
        };
    }

    private static Participant[] createParticipants() {
        return new Participant[] {
                new StandardParticipant("Igor", 50, 30, 20),
                new Cat("Murzik", 60, 25),
                new Cheater("Cheater")
        };
    }

}
