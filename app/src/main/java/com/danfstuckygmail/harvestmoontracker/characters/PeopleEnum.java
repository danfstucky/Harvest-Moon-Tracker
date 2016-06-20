package com.danfstuckygmail.harvestmoontracker.characters;

/**
 * Created by Dan on 6/17/2016.
 */
public class PeopleEnum {

    public enum PeopleCategories {
        BACHELORS("Bachelors"), BACHELORETTES("Bachelorettes"), VILLAGERS("Villagers");

        private String name;
        PeopleCategories(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }

    public enum Bachelors {
        CALVIN("Calvin"), CHASE("Chase"), GILL("Gill"), HARVESTKING("Harvest King"), JIN("Jin"),
        JULIUS("Julius"), LUKE("Luke"), OWEN("Owen"), TOBY("Toby"), WIZARD("Wizard");

        private String name;
        Bachelors(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }

    public enum Bachelorettes {
        ANISSA("Anissa"), CANDACE("Candace"), HARVESTGODDESS("Harvest Goddess"), KATHY("Kathy"),
        LUNA("Luna"), PHOEBE("Phoebe"), RENEE("Renee"), SELENA("Selena"), WITCH("Witch");

        private String name;
        Bachelorettes(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }

    public enum Villagers {
        BARBARA("Barbara"), BO("Bo"), CAIN("Cain"), CHLOE("Chloe"), COLLEEN("Colleen"), CRAIG("Craig"),
        DALE("Dale"), HAMILTON("Hamilton"), HANNA("Hanna"), HAYDEN("Hayden"), IRENE("Irene"), JAKE("Jake"),
        MIRA("Mira"), OZZIE("Ozzie"), PAOLO("Paolo"), PASCAL("Pascal"), PERRY("Perry"), RAMSEY("Ramsey"),
        RUTH("Ruth"), SAMSON("Samson"), SHELLY("Shelly"), SIMON("Simon"), SUE("Sue"), TAYLOR("Taylor"), YOLANDA("Yolanda");

        private String name;
        Villagers(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }
}
