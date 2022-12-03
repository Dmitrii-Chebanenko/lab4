package enums;

public enum Songs {
    ПОСОСИ,
    КАДИЛАК,
    NEVERGONNAGIVEMEUP;
    public static String getName(Songs song) {
        return switch (song) {
            case ПОСОСИ -> "ПОСОСИ";
            case КАДИЛАК -> "КАДИЛАК";
            case NEVERGONNAGIVEMEUP -> "NEVERGONNAGIVEMEUP";
        };
    }
    public static String getWords(Songs song) {
            return switch (song){
                case ПОСОСИ -> "[Вступление]\n" +
                        "Пососи!\n" +
                        "\n" +
                        "[Припев]\n" +
                        "У, у, у, у, у\n" +
                        "Да, я богатый у*бок, а (money)\n" +
                        "У меня денег так много, а (cash)\n" +
                        "Моё е*ало — коробка\n" +
                        "У, у, у, у, у!\n" +
                        "\n" +
                        "Х*ли, б*я, ты такой робкий, а?\n" +
                        "Ты же базарил так громко, а (п*здел)\n" +
                        "Так-так и быть делай фотку\n" +
                        "Ву-у-у-у! Пока я добрый, с*чка\n" +
                        "\n" +
                        "Да, я п*здец ох*евший (да)\n" +
                        "С*ка твоя без одежды\n" +
                        "Эй (у, у, у, у)\n" +
                        "Я подарю ей нежность (с*кс)\n" +
                        "\n" +
                        "Иди сюда!\n" +
                        "Прыг-прыгай прямо меж ног (вууу!)\n" +
                        "Доедаю пром*жност, э (ам-м-м)\n" +
                        "Это, с*ка, любовь\n" +
                        "\n" +
                        "[Куплет 1]\n" +
                        "Х*ли ты мне сча вякнешь, а-а?\n" +
                        "С*ка, ты сын домашний (с*си)\n" +
                        "Rollie на мне — швейцарские (блеск)\n" +
                        "Цепь на мне — это важно (chain)\n" +
                        "\n" +
                        "Дети, покушайте кашу (ам)\n" +
                        "Я пока ногти накрашу (вау!)\n" +
                        "С*ки твоей буду краше (яу!)\n" +
                        "Она зовёт меня крашем, эй\n" +
                        "\n" +
                        "Я — легенда, как Цой (эй!)\n" +
                        "Но такой молодой (как Цой!)\n" +
                        "Подавился мацой (ау-у-у-у-у!)\n" +
                        "Тупо, тип, ты тупой (эй)\n" +
                        "\n" +
                        "Думай эго, мне пох*й (пох*й)\n" +
                        "Чё, DaBaby? Да пох*й (Да пох*й)\n" +
                        "Х*й огромный, как п*нис (чл*н)\n" +
                        "На мне прыгает ж*па\n" +
                        "\n" +
                        "\n" +
                        "[Скит]\n" +
                        "Bounce, bounce\n" +
                        "Bounce, bounce\n" +
                        "Bounce, bounce\n" +
                        "Bounce, bounce\n" +
                        "Bounce, bounce\n" +
                        "Bounce, bounce\n" +
                        "Ау, я всё\n" +
                        "\n" +
                        "[Переход]\n" +
                        "Шутки в сторону, с*ка (ух!)\n" +
                        "Я тебе чё, Иуда? (what?)\n" +
                        "С государством работал? (нет)\n" +
                        "Не! Но теперь буду (йе)\n" +
                        "Источник teksty-pesenok.ru\n" +
                        "\n" +
                        "Чё ещё? Типа байтер? (what?)\n" +
                        "Сделал деньги на д*унах? (д*унах)\n" +
                        "Да, это так, но на д*унах\n" +
                        "Что хейтят меня в комментариях (вау!)\n" +
                        "\n" +
                        "[Припев]\n" +
                        "У, у, у, у, у\n" +
                        "Да, я богатый у*бок, а (money)\n" +
                        "У меня денег так много, а (cash)\n" +
                        "Моё е*ало — коробка\n" +
                        "\n" +
                        "У, у, у, у, у, вода!\n" +
                        "Х*ли, б*я, ты такой робкий? А\n" +
                        "Ты же базарил так громко, а (п*здел)\n" +
                        "Так-так и быть делай фотку\n" +
                        "\n" +
                        "(Трясутся ручки, ха-ха)\n" +
                        "\n" +
                        "Да, я п*здец ох*евший (да)\n" +
                        "С*ка твоя без одежды, эй\n" +
                        "Я подарю ей нежность\n" +
                        "(С*кс, у, у, у, у)\n" +
                        "\n" +
                        "Иди сюда!\n" +
                        "Прыг-прыгай прямо меж ног\n" +
                        "Доедаю пром*жност (ам-ам)\n" +
                        "Это, с*ка, любовь\n" +
                        "\n" +
                        "[Финал]\n" +
                        "Слава, что ты сделал.\n" +
                        "\n";
                case КАДИЛАК -> "[Текст песни «Cadillac»]\n" +
                        "\n" +
                        "[Интро: MORGENSHTERN]\n" +
                        "Слава, что ты сделал?\n" +
                        "Ха\n" +
                        "\n" +
                        "[Припев: MORGENSHTERN]\n" +
                        "Эй, цепь на мне, сыпь лавэ\n" +
                        "Сотка тыщ на bag LV\n" +
                        "Сотни сук хотят ко мне\n" +
                        "Сотни сук хотят камней\n" +
                        "Как дела? Как дела?\n" +
                        "Это новый Cadillac\n" +
                        "Делать деньги, делать деньги\n" +
                        "Делать деньги, блядь, вот так (Окей, фью)\n" +
                        "[Куплет 1: MORGENSHTERN]\n" +
                        "Эй, bitch, we got some пушки (Пиф-пау)\n" +
                        "Пау-пау, попал по тушке (Ха, тьфу)\n" +
                        "На мне ща две подушки (Оу, да)\n" +
                        "Bitch, я висю, как молодой Пушкин (У)\n" +
                        "Цепи висят на папе (Е)\n" +
                        "Копаем кэш лопатой (Е)\n" +
                        "Богатый, будто каппер (Е)\n" +
                        "Как там твоя зарплата?\n" +
                        "\n" +
                        "[Бридж: MORGENSHTERN]\n" +
                        "Эй, посмотри\n" +
                        "Два мульта на мне — часы\n" +
                        "Три на шее, семь под жопой\n" +
                        "Мне чуть больше двадцати\n" +
                        "Посмотри, посмотри\n" +
                        "Два мульта на мне — часы\n" +
                        "Три на шее, семь под жопой\n" +
                        "Мне чуть больше двадцати\n" +
                        "\n" +
                        "[Припев: MORGENSHTERN]\n" +
                        "Эй, цепь на мне, сыпь лавэ\n" +
                        "Сотка тыщ на bag LV\n" +
                        "Сотни сук хотят ко мне\n" +
                        "Сотни сук хотят камней\n" +
                        "Как дела? Как дела?\n" +
                        "Это новый Cadillac";

                case NEVERGONNAGIVEMEUP -> "I've battled demons that won't let me sleep\n" +
                        "Called to the sea but she abandoned me\n" +
                        "\n" +
                        "But I won't never give up, no, never give up, no, no\n" +
                        "No, I won't never give up, no, never give up, no, no\n" +
                        "\n" +
                        "And I won't let you get me down\n" +
                        "I'll keep gettin' up when I hit the ground\n" +
                        "Oh, never give up, no, never give up no, no, oh\n" +
                        "I won't let you get me down\n" +
                        "I'll keep gettin' up when I hit the ground\n" +
                        "Oh, never give up, no, never give up no, no, oh\n" +
                        "\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "\n" +
                        "Oh yeah, I'm haunted by the distant past\n" +
                        "Called to the skies but she was she overcast\n" +
                        "\n" +
                        "But I won't never give up, no, never give up, no, no\n" +
                        "No, I won't never give up, no, never give up, no, no\n" +
                        "\n" +
                        "And I won't let you get me down\n" +
                        "I'll keep gettin' up when I hit the ground\n" +
                        "Oh, never give up, no, never give up no, no, oh\n" +
                        "I won't let you get me down\n" +
                        "I'll keep gettin' up when I hit the ground\n" +
                        "Oh, never give up, no, never give up no, no, oh\n" +
                        "\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "\n" +
                        "Never give up, never give up\n" +
                        "Never give up, never give up\n" +
                        "No, no, oooh\n" +
                        "\n" +
                        "And I won't let you get me down\n" +
                        "I'll keep gettin' up when I hit the ground\n" +
                        "Oh, never give up, no, never give up no, no, oh\n" +
                        "I won't let you get me down\n" +
                        "I'll keep gettin' up when I hit the ground\n" +
                        "Oh, never give up, no, never give up no, no, oh\n" +
                        "\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "I'll find my way, find my way home, oh, oh, oh\n" +
                        "\n";
            };
        }
    public static String getPath(Songs song){
        return switch(song){
            case ПОСОСИ -> "./src/sounds/morgenshtern-pososi-mp3.wav";
            case КАДИЛАК ->"./src/sounds/morgenshtern-eldzhej-kadillak-mp3.wav";
            case NEVERGONNAGIVEMEUP -> "./src/sounds/Rick_Astley_-_Never_Gonna_Give_You_Up_musmore.wav";
        };
    }
}
