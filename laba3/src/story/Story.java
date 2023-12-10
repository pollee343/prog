package story;

import enumerate.Mood;
import enumerate.Places;
import enumerate.Sex;
import things.Book;

import java.text.ParseException;

import static enumerate.Mood.*;

public class Story{
    public static void startStory(){
        Heroes miniDonate = new Heroes("Пончик", Sex.MALE);
        Heroes miniFish = new Heroes("Пискарик", Sex.MALE);

        Book book = new Book("1000 и 1 анекдот", "Шутник");

        miniDonate.setMood(Mood.HAPPINESS);
        System.out.printf(
                "Через некоторое время он, однако, %s, что все меньше испытывает %s, от верчения на %s\n",
                miniDonate.startAction("замечать"), miniDonate.getMood(), Places.WHEEL.getTittle()
        );
        miniDonate.setMood(Mood.PLEASURE);
        System.out.printf(
                "Всякое %s отравляла мысль о том, что, пока он %s, кто-то другой принужден вращать колесо,\n",
                miniDonate.getMood(), miniDonate.doingAction("вертится")
        );
        miniDonate.getPlaces(Places.TUB);
        System.out.printf(
                "выбиваясь из последних сил и %s от недостатка воздуха в мрачной, сырой %s.\n",
                miniDonate.doingAction("задыхаясь"), miniDonate.getPlaces(Places.TUB)
        );
        System.out.printf(
                "Наконец эта мысль сделалась до такой степени %s ему, что он и вовсе %s на чертовом %s.\n",
                DISGUSTING.getTittle(), miniDonate.endAction("вертеться"), Places.WHEEL.getTittle()
        );

        System.out.printf(
                "Теперь у %s %s %s: %s о том о сем с крутильщиком %s, с которым он %s в одной %s.\n",
                miniDonate.getName(), miniDonate.doingAction("осталась одна"), JOY.getTittle(),
                miniDonate.doingAction("поболтать"), miniFish.getName(), miniDonate.doingAction("работал"),
                Places.TUB.getTittle()
        );
        System.out.printf(
                "Этот %s %s %s за его привычку вертеться на %s. Он %s,\n",
                miniFish.getName(), miniFish.startAction("презирал"), miniDonate.getName(),
                Places.WHEEL.getTittle(), miniFish.doingAction("говорил")
        );
        System.out.println(
                "что это занятие годится лишь для богатых бездельников, которые не знают," +
                        " куда им девать время и деньги, простому же,"
        );
        System.out.println(
                "нормальному коротышке стыдно тратить с таким трудом заработанные денежки на пустое баловство."
        );
        miniFish.setMood(NO_EMOTIONS);
        System.out.printf(
                "%s, что %s не %s больше этим пустячным делом, %s %s над ним.\n",
                miniFish.doingAction("Увидев"), miniDonate.getName(), miniDonate.doingAction("увлекается"),
                miniFish.getName(), miniFish.endAction("посмеиваться")
        );
        System.out.printf(
                "Теперь он %s с %s на серьезные темы, %s одними шуточками, и %s иногда %s книжку %s %s.\n",
                miniFish.doingAction("беседовал"), miniDonate.getName(), miniFish.doingAction("не отделываясь"),
                miniFish.doingAction("давал"), miniDonate.doingAction("почитать"), book.getName(),
                book.getAuthor()
        );
    }
}
