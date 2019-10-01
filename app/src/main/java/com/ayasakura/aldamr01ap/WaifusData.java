package com.ayasakura.aldamr01ap;

import com.ayasakura.aldamr01ap.R;

import java.util.ArrayList;

public class WaifusData {

    static ArrayList<Waifus> getListData(){

        ArrayList<Waifus> list = new ArrayList<>();

        for (int position = 0; position < waifuNames.length; position++){
            Waifus waifu = new Waifus();
            waifu.setName(waifuNames[position]);
            waifu.setDescription(waifuDetails[position]);
            waifu.setProfile(waifuImages[position]);
            list.add(waifu);
        }
        return list;
    }

    private static String[] waifuNames = {
            "Emilia",
            "Lacia",
            "Ayase Araagi",
            "Shinobu Oshino",
            "Illyasviel von einzbern",
            "Lelei Lalena",
            "Yusa Emi",
            "Ryugajou Nanana",
            "Lupusregina Beta",
            "Konjiki no Yami",
    };

    private static String[] waifuDetails = {
            "Emilia is good natured and likes to take care of others, though she herself refuses to admit it, instead thinking of it as her own selfishness. She is indifferent to her own appearance, leaving Puck to take care of her clothes and hair. Because her appearance is similar to the Witch of Envy, she has received unfair discrimination from others. She sometimes acts like a child and is unacquainted with the world as she used to live in the woods with other Elves, though despite this she still works hard to become a ruler.\n",
            "An hIE gynoid who escaped from the Tokyo Laboratory of the Memeframe Corporation. She encounters Arato and she is asking him to become her \"Owner.\" Her weapon is a black casket that is used to stop bullets. ",
            "Ayase is Kirino's friend and classmate who works as a model alongside her and is also her best friend. Ayase is a friendly, nice, and refined lady, but becomes agitated and somewhat violent at the thought that she is being lied to, which she hates above all else. She tends to believe what she sees on the news. Therefore, she disapproves of anime and manga, calling it a disgusting hobby, especially eroge, due to the media portrayal that otaku will eventually become criminals.",
            "Shinobu is a girl who lives with Meme in an abandoned building. She loves donuts from \"Mister Donut.\" She was named Shinobu by Meme at the beginning of Hitagi Crab, suggesting her kanji name Shinobu (忍), having \"heart\" (心) under \"blade\" (刃), matches with her original personality.",
            "A young Teutonic aristocrat, she traveled to Japan to participate in the Holy Grail War as a Master. Illyasviel has an angelic appearance and an unsurpassed degree of magical power. She lives in a castle on the outskirts of Fuyuki City, accompanied only by her Servant and two maids. Illyasviel asks those she feels comfortable around to simply call her \"Illya.\"\n",
            "A sage and sorceress of the human race. The second disciple of Cato the elder sage. Although being a knowledgeable person with outstanding talents, she rarely shows emotion. Due to her petite frame, she looks younger than she actually is.\n",
            "The hero who defeated Satan Lord. After forcing the Satan Lord out, she is not satisfied until she sees to it that he is destroyed so she follows him into the human world. However, just like the Satan Lord, upon coming to Earth, she is reduced into a commoner and most of her powers are gone. She works as a customer service at Docodemo to earn a living.",
            "Her so called Nanana's Collection were rumored to be a treasure trove of her enormous fortune that she amass from her treasure hunting adventures, where part of it was used to fund her project, while the rest were hidden all over the island. Among her collections are rare and mysterious artifacts that contains magical properties.\n",
            "She is a brown-skinned beauty with a sporty look and red hair tied in two long braids. Lupusregina wears a maid uniform with short sleeves and long black gloves, with a skirt that has a long slit on it's left side, revealing thigh high white stockings. She is equipped with an imposing black and silver scepter slung across her back.",
            "A dispassionate, withdrawn assassin, Golden Darkness is hired by one of Lala's arranged suitors, Lacospo to kill Rito, until she breaks the contract, noting the true nature behind her target. Golden Darkness is currently staying on Earth, roaming around the city streets and Sainan High, with a motivation to continue her duty to assassinate Rito, although she has yet to accomplish this (hinting she only said this as an excuse to stay on Earth, which is then confirmed).",
    };

    private static int[] waifuImages = {
            R.drawable.emilia,
            R.drawable.lacia,
            R.drawable.ayase,
            R.drawable.shinobu,
            R.drawable.illya,
            R.drawable.lelei,
            R.drawable.yusaemi,
            R.drawable.nanana,
            R.drawable.lupusregina,
            R.drawable.yami
    };
}
