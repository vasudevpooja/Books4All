package com.example.books4all;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;


import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;
public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Books4All1.pdf")
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true)
                .pageFitPolicy(FitPolicy.WIDTH) 
                .load();
        }
        private TextToSpeech textToSpeech;
        @Override
        protected void onStart() {
            super.onStart();
            textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if (status == TextToSpeech.SUCCESS) {

                        String myText1 = "Hello, This app was specifically made for the old age people who can't read novels and books due to their poor eyesight and have to give up on their love for literature. This app helps you keep that child alive by reading the book for you."

                                +" As a sample we have chosen a few pages from the book \"To All The Boys I've Loved Before\" by the writer Jenny Han.\n" +  "Enjoy!\n";

                        String myText2 = " For my sister, Susan—Han girls forever\n" +
                                "\n" +
                                "I like to save things. Not important things like whales or people or the environment. Silly things. Porcelain bells, the kind you get at souvenir shops. Cookie cutters you’ll never use, because who needs a cookie in the shape of a foot? Ribbons for my hair. Love letters. Of all the things I save, I guess you could say my love letters are my most prized possession. I keep my letters in a teal hatbox my mom bought me from a vintage store downtown. They aren’t love letters that someone else wrote for me; I don’t have any of those. These are ones I’ve written. There’s one for every boy I’ve ever loved—five in all. When I write, I hold nothing back. I write like he’ll never read it. Because he never will. Every secret thought, every careful observation, everything I’ve saved up inside me, I put it all in the letter. When I’m done, I seal it, I address it, and then I put it in my teal hatbox. They’re not love letters in the strictest sense of the word. My letters are for when I don’t want to be in love anymore. They’re for good-bye. Because after I write my letter, I’m no longer consumed by my all-consuming love. I can eat my cereal and not wonder if he likes bananas over his Cheerios too; I can sing along to love songs and not be singing them to him. If love is like a possession, maybe my letters are like my exorcisms. My letters set me free. Or at least they’re supposed to.\n" +
                                "\n";
                        String myText3 = "CHAPTER - 1:\n" +
                                "\n" +
                                "JOSH IS MARGOT’S BOYFRIEND, BUT I guess you could say my whole family is a little in love with him. It’s hard to say who most of all. Before he was Margot’s boyfriend, he was just Josh. He was always there. I say always, but I guess that’s not true. He moved next door five years ago but it feels like always. My dad loves Josh because he’s a boy and my dad is surrounded by girls. I mean it: all day long he is surrounded by females. My dad is an ob-gyn, and he also happens to be the father of three daughters, so it’s like girls, girls, girls all day. He also likes Josh because Josh likes comics and he’ll go fishing with him. My dad tried to take us fishing once, and I cried when my shoes got mud on them, and Margot cried when her book got wet, and Kitty cried because Kitty was still practically a baby. Kitty loves Josh because he’ll play cards with her and not get bored. Or at least pretend to not get bored. They make deals with each other—if I win this next hand, you have to make me a toasted crunchy-peanut-butter-sandwich, no crusts. That’s Kitty. Inevitably there won’t be crunchy peanut butter and Josh will say too bad, pick something else. But then Kitty will wear him down and he’ll run out and buy some, because that’s Josh. If I had to say why Margot loves him, I think maybe I would say it’s because we all do. We are in the living room, Kitty is pasting pictures of dogs to a giant piece of cardboard. There’s paper and scraps all around her. Humming to herself, she says, “When Daddy asks me what I want for Christmas, I am just going to say, ‘Pick any one of these breeds and we’ll be good.’” Margot and Josh are on the couch; I’m lying on the floor, watching TV. Josh popped a big bowl of popcorn, and I devote myself to it, handfuls and handfuls of it. A commercial comes on for perfume: a girl is running around the streets of Paris in an orchid-colored halter dress that is thin as tissue paper. What I wouldn’t give to be that girl in that tissue-paper dress running around Paris in springtime! I sit up so suddenly I choke on a kernel of popcorn. Between coughs I say, “Margot, let’s meet in Paris for my spring break!” I’m already picturing myself twirling with a pistachio macaron in one hand and a raspberry one in the other. Margot’s eyes light up. “Do you think Daddy will let you?” “Sure, it’s culture. He’ll have to let me.” But it’s true that I’ve never flown by myself before. And also I’ve never even left the country before. Would Margot meet me at the airport, or would I have to find my own way to the hostel? Josh must see the sudden worry on my face because he says, “Don’t worry. Your dad will definitely let you go if I’m with you.” I brighten. “Yeah! We can stay at hostels and just eat pastries and cheese for all our meals.” “We can go to Jim Morrison’s grave!” Josh throws in. “We can go to a parfumerie and get our personal scents done!” I cheer, and Josh snorts. “Um, I’m pretty sure ‘getting our scents done’ at a parfumerie would cost the same as a week’s stay at the hostel,” he says. He nudges Margot. “Your sister suffers from delusions of grandeur.” “She is the fanciest of the three of us,” Margot agrees.“What about me?” Kitty whimpers. “You?” I scoff. “You’re the least fancy Song girl. I have to beg you to wash your feet at night, much less take a shower.” Kitty’s face gets pinched and red. “I wasn’t talking about that, you dodo bird. I was talking about Paris.” Airily, I wave her off. “You’re too little to stay at a hostel.” She crawls over to Margot and climbs in her lap, even though she’s nine and nine is too big to sit in people’s laps. “Margot, you’ll let me go, won’t you?” “Maybe it could be a family vacation,” Margot says, kissing her cheek. “You and Lara Jean and Daddy could all come.” I frown. That’s not at all the Paris trip I was imagining. Over Kitty’s head Josh mouths to me, We’ll talk later, and I give him a discreet thumbs-up.\n";

                        textToSpeech.speak(myText1, TextToSpeech.QUEUE_FLUSH, null, null);
                        textToSpeech.speak(myText2, TextToSpeech.QUEUE_ADD, null, null);
                        textToSpeech.speak(myText3, TextToSpeech.QUEUE_ADD, null, null);
                    }
                }
            });
        }
    }