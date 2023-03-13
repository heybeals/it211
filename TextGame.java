import java.util.Scanner;
import java.util.Set;

class character {
    private String name;
    private String race;
    private String raceDesc;
    private String jobClass;
    private int strength;
    private int magic;
    private int perception;
    private int charisma;
    private int intel;
    private int agility;
    private int luck;

    void addName(String characterName) {

        name = characterName;
    }

    void addRace(int characterRace) {
        if (characterRace == 1) {
            race = "Neph";
            raceDesc = "Nephilim are a race of Half-Angel Half-Human, while Nephalem are a rare race of Half-Angel Half-Demon";
            return;
        }
        if (characterRace == 2) {
            race = "Cambion";
            raceDesc = "Cambion are a race of Half-Demon Half-Human";
            return;
        }
        if (characterRace == 3) {
            race = "Shifter";
            raceDesc = "Shifters are thought to be decendants of Lycans and witches who, unlike their Lycan relatives, can shift and hold their animal form at will";
            return;
        }
        if (characterRace == 4) {
            race = "Half-Dragon";
            raceDesc = "Half-Dragons are a race of Half-Dragon and half mortal race, usually human or fae";
            return;
        }
        if (characterRace == 5) {
            race = "Fae";
            raceDesc = "Fae are an elder race that have long since vanished, but the term is used to refer to the 16 subclasses of their offspring";
            return;
        }
        if (characterRace == 6) {
            race = "Elemental";
            raceDesc = "Members of this race are not actually elementals, but mostly creatures with a special affinity for one or more of the four elements and oriented towards nature and animals. Elemntal influence strongly shapes not only the members' physiology, but also their outlook and personality";
            return;
        }
        if (characterRace == 7) {
            race = "Witch";
            raceDesc = "Witches are a race of both women and men who have been blessed by the Goddess with a natural ability to weild, use, and manipulate magic or spirit without incantations";
            return;
        }
        if (characterRace == 8) {
            race = "Human";
            raceDesc = "Humans are the youngest of the common races without natural magic, but an adaptable and ambitious race that uses science and innovation. This race with a lower aptitude for magic can still learn limited praction to become mages.";
            return;
        }
    }

    void addJobClass(int characterJobClass) {
        if (characterJobClass == 1) {
            jobClass = "Warrior";
            return;
        }
        if (characterJobClass == 2) {
            jobClass = "Witchcraft";
            return;
        }
        if (characterJobClass == 3) {
            jobClass = "Mage";
            return;
        }
        if (characterJobClass == 4) {
            jobClass = "Scholar";
            return;
        }
        if (characterJobClass == 5) {
            jobClass = "Mercenary";
            return;
        }
        if (characterJobClass == 6) {
            jobClass = "Adventurer";
            return;
        }
        if (characterJobClass == 7) {
            jobClass = "Merchant";
            return;
        }
    }

    void setcharacter(int characterStrength, int characterMagic, int characterPerception, int characterCharisma, int characterIntel, int characterAgility, int characterLuck) {
        strength = characterStrength;
        magic = characterMagic;
        perception = characterPerception;
        charisma = characterCharisma;
        intel = characterIntel;
        agility = characterAgility;
        luck = characterLuck;
    }

    void work() {

    }

    void printCharacterInfo() {
        System.out.println("-------- CHARACTER BUILD --------" + "\n");
        System.out.println("Character Name is:" + name + "\n");
        if (race == null) {
            System.out.println("You've entered an invalid race.");
        } else {
            System.out.println("Race:" + race + "\n" + "Race Details:" + raceDesc + "\n");
        }
        if (jobClass == null) {
            System.out.println("You've entered an invalid job class.");
        } else {
            System.out.println("Beginning job class:" + jobClass + "\n");
        }
        System.out.println("----- " + name + "'s Attributes -----" + "\n");
        System.out.println("Strength:" + strength + "\n");
        System.out.println("Magical Aptitude:" + magic + "\n");
        System.out.println("Perception:" + perception + "\n");
        System.out.println("Charisma:" + charisma + "\n");
        System.out.println("Intelligence:" + intel + "\n");
        System.out.println("Agility:" + agility + "\n");
        System.out.println("Luck:" + luck + "\n");
    }
}

class characterBuild {
    public static void main(String[] args) {
        character character = new character();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Character name: ");
        String charName = input.nextLine();
        character.addName(charName);
        System.out.println("Enter 1 for Neph " + "\n" + "Enter 2 for Cambion " + "\n"+ "Enter 3 for Shifter " + "\n" + "Enter 4 for Half-Dragon " + "\n" + "Enter 5 for Fae "  + "\n" + "Enter 6 for Elemental " + "\n" + "Enter 7 Witch " + "\n" + "Enter 8 for Human" + "\n");
        System.out.print("Please select your character's race (1-8): ");
        int charRace = input.nextInt();
        character.addRace(charRace);
        System.out.println("Enter 1 for Warrior" + "\n" + "Enter 2 for Witchcraft" + "\n" + "Enter 3 for Mage" + "\n" + "Enter 4 for Scholar" + "\n" + "Enter 5 for Mercenary" + "\n" + "Enter 6 for Adventurer" + "\n" + "Enter 7 for Merchant" + "\n");
        System.out.print("Please select your character's intial job class (1-7): ");
        int charJobClass = input.nextInt();
        character.addJobClass(charJobClass);
        for (int i = 0;; i++) {
            System.out.println("-------- ATTRIBUTES --------" + "\n");
            System.out.println("You have 21 Attribute points to define your character (Strength, Magical Aptitude, Perception, Charisma, Intelligence, Agility, and Luck)");
            System.out.print("Please assign Strength points: ");
            int charStrength = input.nextInt();
            System.out.print("Please assign Magical Aptitude points: ");
            int charMagic = input.nextInt();
            System.out.print("Please assign Perception points: ");
            int charPerception = input.nextInt();
            System.out.print("Please assign Charisma points: ");
            int charCharisma = input.nextInt();
            System.out.print("Please assign Intelligence points: ");
            int charIntel = input.nextInt();
            System.out.print("Please assign Agility points: ");
            int charAgility = input.nextInt();
            System.out.print("Please assign Luck points: ");
            int charLuck = input.nextInt();
            int totalAttribute = charStrength + charMagic + charPerception + charCharisma + charIntel + charAgility + charLuck;
            if (totalAttribute == 21) {
                character.setcharacter(charStrength, charMagic, charPerception, charCharisma, charIntel, charAgility, charLuck);
                break;
            }
            if (totalAttribute < 21) {
                System.out.println("----- Oh No -----" + "\n");
                System.out.println("All the Attribute points have not been assigned");
                System.out.println("Would you like to redistribute the points?" + "\n" + "Enter 1 to Redistribute, or Enter 2 to Continue");
                int resetAttributes = input.nextInt();
                if (resetAttributes == 1) {
                    continue;
                } else {
                    character.setcharacter(charStrength, charMagic, charPerception, charCharisma, charIntel, charAgility, charLuck);
                    break;
                }
            } else {
                System.out.println("----- Oh No -----" + "\n");
                System.out.println("Total Attribute points cannot exceed 21" + "\n");
                System.out.println("Would you like to redistribute the points?" + "\n" + "Enter 1 to Redistribute, or Enter 2 to Continue");
                int resetAttributes = input.nextInt();
                if (resetAttributes == 1) {
                    continue;
                } else {
                    character.setcharacter(3, 3, 3, 3, 3,3, 3);
                    break;
                }
            }

        }
        character.printCharacterInfo();
    }
}