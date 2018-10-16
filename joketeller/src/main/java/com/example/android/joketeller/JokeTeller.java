package com.example.android.joketeller;

import java.util.Random;

public abstract class JokeTeller {

    private static String[] jokes = {
            "Q. How do vampires start their letters? A. “Tomb it may concern…”",
            "Q. What’s a writing utensil’s favorite place to go on vacation? A. Pencil-vania!",
            "Q. How does the Man in the Moon cut his hair? A. Eclipse it!",
            "Q. Where do polar bears keep their money? A. In a snow bank!",
            "Q. Why did the dinosaur cross the road? A. Because chickens didn't exist yet!",
            "Q. Why was the broom late for school? A. It overswept!",
            "Q. What do you call a duck that loves making jokes? A. A wise-quacker!",
            "Q. What did the finger say to the thumb? A. I'm in glove with you!",
            "Q. What did one pickle say to the other pickle who wouldn't stop complaining? A. \"Dill with it.\"",
            "Q. What's really fast, loud, and tastes good with salsa? A. A rocket chip!",
            "Q: Why are teddy bears never hungry? A: Because they're always stuffed.",
            "Q: What did one toilet say to the other toilet? A: You look flushed.",
            "Q: What's the best time to go to the dentist? A: Tooth hurty.",
            "Q: Where do beef burgers go to dance? A: The meatball.",
            "Q: Which side of a duck has the most feathers? A: The outside.",
            "Q: Where do Volkswagens go when they get old? A: The old Volks home.",
            "Q: What do a dog and a phone have in common? A: They both have collar ID.",
            "Q: What did the red light say to the green light? A: Don't look, I'm changing.",
            "Q: What do you call a T-Rex that's been beaten up? A: Dino-sore.",
            "Q: What did the axe murderer say to the judge? A: It was an axe-ident."
    };

    public static String tellJoke() {
        return jokes[new Random().nextInt(20)];
    }
}
