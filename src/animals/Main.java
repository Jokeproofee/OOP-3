package animals;

public class Main {

    public static void main(String[] args) {
        //Травоядные
        System.out.println("Травоядные");
        Herbivores gazelle = new Herbivores("Газель",10,"Саванна",40,"Трава");
        Herbivores giraffe = new Herbivores("Жираф",15,"Саванна",20,"Трава");
        Herbivores horse = new Herbivores("Лошадь",5,"Степь",50,"Сено");

        System.out.println(gazelle);
        gazelle.eat();
        gazelle.sleep();
        gazelle.go();
        gazelle.walk();
        gazelle.graze();
        System.out.println(giraffe);
        System.out.println(horse);

        //Хищники
        System.out.println("Хищники");
        Predators hyena = new Predators("Гиена",7,"Саванна",20,"Мясо");
        Predators tiger = new Predators("Тигр",8,"Джунгли",60,"Мясо");
        Predators bear = new Predators("Медведь",11,"Лес",15,"Мясо,рыба");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        //Земноводные
        System.out.println("Земноводные");
        Amphibians frog = new Amphibians("Лягушка",1,"Болото");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный",3,"Река");

        System.out.println(frog);
        System.out.println(alreadyFreshwater);

        //Нелетающие
        System.out.println("Нелетающие");
        Flightless peacock = new Flightless("Павлин",2,"Река","Ходьба");
        Flightless penguin = new Flightless("Пингвин",5,"Ледники","Ходьба");
        Flightless dodoBird = new Flightless("Птица Додо",6,"Река","Ходьба");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);

        //Летающие
        System.out.println("Летающие");
        Flying seagull = new Flying("Чайка",3,"Озеро","Летает");
        Flying albatross = new Flying("Альбатрос",5,"Озеро","Летает");
        Flying falcon = new Flying("Сокол",7,"Лес","Летает");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}
