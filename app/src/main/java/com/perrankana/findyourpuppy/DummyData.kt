/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.perrankana.findyourpuppy

import com.perrankana.findyourpuppy.model.Age
import com.perrankana.findyourpuppy.model.Gender
import com.perrankana.findyourpuppy.model.Puppy
import com.perrankana.findyourpuppy.model.Size

val puppies = listOf(
    Puppy(
        id = 0,
        name = "Chip",
        age = Age.Adult,
        thumbnail = R.drawable.chip_small,
        breed = "Coonhound",
        gender = Gender.Male,
        size = Size.Medium,
        description = "Handsome CHIP is a 3 year old male coonhound. Small and compact at 40 lbs. He’s so smart and sweet. He’s a “working dog” and loves to sniff!. Chip can be a bit on the nervous side and can get a little hyper at times. He would benefit from training and someone with breed experience would be a definite plus for him! Chip is housebroken.\n",
    ),
    Puppy(
        id = 1,
        name = "Granny",
        age = Age.Adult,
        thumbnail = R.drawable.granny_small,
        breed = "Pekingese & Pug Mix",
        gender = Gender.Female,
        size = Size.Tiny,
        description = "This sweet pretty girl is Granny. She’s about 6 years old and weighs 22 pounds and has not had an easy life. She was rescued from a Chinese Meat Festival truck. Volunteers and fosters have worked hard to get her to a comfortable point. She is improving daily. She enjoys lap time and playing outside! She’s selective with her people, and needs a patient adopter.\n" +
            "\n" +
            "She would be best in a home without young kids or men. She can’t fully get over her fear of men, so we want to set her up for success. Someone who is home a bit to work with her and continue to boost her confidence would be amazing. Your dedication and patience will be rewarded with lots of love."
    ),
    Puppy(
        id = 2,
        name = "Miss Kitty",
        age = Age.Senior,
        thumbnail = R.drawable.miss_kitty_small,
        breed = "Italian Greyhound",
        gender = Gender.Female,
        size = Size.Small,
        description = "Miss Kitty is a very sweet, well-behaved, loving senior Italian Greyhound. She is around 9 years old. She came in with her buddy Matt. Matt and Miss Kitty are very bonded, so they MUST BE PLACED TOGETHER AS A PAIR. Please give this pair a chance at a forever home. They are so full of love!"
    ),
    Puppy(
        id = 3,
        name = "Allie",
        age = Age.Puppy,
        thumbnail = R.drawable.allie,
        breed = "Labrador Retriever & Terrier Mix",
        gender = Gender.Female,
        size = Size.Small,
        description = "Allie (3 months old) came to the rescue Feb 29th from South Carolina. She is a sweet girl, a very frightened of humans but is but is making some progress. She will probably remain small to medium (@40lbs) sized but this is a best guess. We would like her to go to a home with a fenced in back yard and someone with experience in working with dogs that are scared and untrusting of humans. She does well with other dogs and cats. Her adoption fee is \$400.00 which includes her transport fees, age appropriate vaccines, spay and microchip. If interested in adopting/meeting her, please request for an adoption application and please indicate your experience in dealing with frightened dogs. If you do not indicate your experience, no one will respond to you.\n" +
            "\n" +
            "We are not a shelter. Because all our pets are in private foster homes, we require everyone to fill out an adoption application and have their references checked, prior to meeting our pets. If you are interested in this pet, please email info@k9sinneed.com for an adoption application. ",
    ),
    Puppy(
        id = 4,
        name = "Jenny",
        age = Age.Adult,
        thumbnail = R.drawable.jenny,
        breed = " Beagle & American Bulldog Mix ",
        gender = Gender.Female,
        size = Size.Medium,
        description = "Jenny is a unique Bulldog/Beagle mix. She is 5 yrs old and weighs approximately 35 pounds. She is a retired breeder mom.\n" +
            "\n" +
            "Jenny was dangerously underweight, depressed and scared of everyone and everything when she arrived at Res-Q-Pets in November 2020. During her time in a foster home, she has transformed, albeit slowly. She seeks comfort from other dogs and therefore, MUST live in a home with at least one other dog. She eagerly wags her tail when a new foster arrives. We've seen her take care of and \"mother\" dogs her size and smaller.\n" +
            "\n" +
            "Jenny MUST have a fenced yard for her own safety. She scares easily and isn't quick to find her way home if not fenced in. She's the ultimate couch potato, nap-taking, binge-watching sleep-with-you dog.\n" +
            "\n" +
            "She is sweet, loving & sensitive. She needs a patient family who understands her uniqueness and is willing to give her time to fully adjust. She has been spayed & all shots are up to date. Jenny is also microchipped. She should NOT be crated. She is not leash/harness trained, nor housebroken (yet)."
    ),
    Puppy(
        id = 5,
        name = "Drifter",
        age = Age.Senior,
        thumbnail = R.drawable.drifter,
        breed = "Mixed Breed",
        gender = Gender.Male,
        size = Size.Small,
        description = "Res-Q-Pets will require a home visit for all dog adoptions.\n" +
            "\n" +
            "* Applicants must live within a 20-mile radius of Mercer County, NJ.\n" +
            "\n" +
            "* Many applications are received, only the matched applicant will be contacted.\n" +
            "\n" +
            "* DRIFTER is a 14yo male Bichon * Retired stud dog * DRIFTER is a very nervous dog who needs someone that is patient and willing to work with him * He is not housetrained AT ALL * He doesn't have any teeth. * Very sweet dog who doesn't have a mean bone in his body * He's a runner and skittish, so we will require that the adopter have a fenced yard."
    ),
    Puppy(
        id = 6,
        name = "Ben",
        age = Age.Young,
        thumbnail = R.drawable.ben,
        breed = "Maltipoo",
        gender = Gender.Male,
        size = Size.Small,
        description = "Meet Ben! He fits in our \"pals\" category. Ben is not a typical lap dog who likes to snuggle. He just completed a board and train program to work on his confidence and other behaviors he exhibits when he gets nervous. He will need a committed person who will dedicate time each day to work on his training and provide a structured home where Ben can thrive and be his best self. He is dog friendly and would do best with adults only."
    ),
    Puppy(
        id = 7,
        name = "Hunter",
        age = Age.Adult,
        thumbnail = R.drawable.hunter,
        breed = "Alaskan Malamute Mix",
        gender = Gender.Male,
        size = Size.Large,
        description = "Hunter is sweet loving 6yr old WOLF DOG malamute mix looking for his forever home. Hunter gets along with most dogs but it is unknown how he would do with small breeds. He would have to be adopted to a home with another canine companion to keep him company. Hunter is known to be an escape artist so he would need a 7-8ft fenced in area/ yard. He would also need some house training to spend any time in the house. Hunter is currently learning not to jump up on people to greet them as he does not know his own strength and gets very excited at times. Hunter is a very high energy dog so he would need daily exercise, he walks best on an EZ walk harness. He is a quick learner and very treat motivated. Hunter could use better skills/ manners when being fed as he gets very excited with food in sight! Hunter has been around children and from what we observed he is good with them so far, it is unknown how he would do with them for long periods of time. He loves to run given the energy he has and would enjoy potential hikes/ long walks with his new owners! Hunter over all has a great temperament and would make a wonderful loving companion animal for the right person!"
    ),
    Puppy(
        id = 8,
        name = "Lola",
        age = Age.Adult,
        thumbnail = R.drawable.lola,
        breed = "American Bulldog",
        gender = Gender.Female,
        size = Size.Medium,
        description = "LOLA!!! This sweet wiggle butt of a girl has so much love to give. Give her a little time to get to know you... and we KNOW both you and she will fall in love! Lola has had a couple of homes that did not work out, the first person who loved her fell on hard times and had no choice but to surrender her to the shelter. The second home decided after two years they “didn't want her anymore” so back to the shelter she went. (From the way Lola was acting when returned it would appear that she may not have been treated very nicely either. No wonder she has trust issues and anxiety! ) Lola would do best in a quiet home with experienced and patient guardian(s) who will give her the time she needs to settle in/feel comfortable and are willing to help her with her anxiety from loud noises (fireworks etc). No other dogs, cats, kids."
    ),
    Puppy(
        id = 9,
        name = "Capone",
        age = Age.Young,
        thumbnail = R.drawable.capone,
        breed = "Pit Bull Terrier Mix",
        gender = Gender.Male,
        size = Size.Medium,
        description = "I’m Capone and I am about 3 years old. I recently completed a full board and train program and now I am the best version of myself. I am a silly, goofy boy who would do best in a home with adults only and no other pets.\n" +
            "\n" +
            "I know all kinds of tricks and need someone who will keep up on my fun training! I know all my commands. Sometimes I can be a little shy meeting new people but I quickly warm up when I am ready. I am looking for my forever home!"
    ),
)
