package Marathon.Impementation;

import Marathon.Interface.Competitor;

public class Team {

    private String name;
    private Competitor[] competitors;

    public Team(String name) {
        this.name = name;
        this.competitors = new Competitor[] {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Human("Марта")};
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }


    // информация обо всех членах команды
    public void ShowCompetitorsInfo() {
        for (Competitor c : competitors
             ) {
            c.info();
        }
    }


    // информация о прошедших дистанцию
    public void ShowResults() {
        // проверяем каждого участника. Если прошел, выводим инфо

        System.out.println("");
        System.out.println("Список победителей");
        for (Competitor c: competitors
             ) {
            if (c.isOnDistance()) c.info();
        }
    }
}
