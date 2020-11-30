package pl.edu.uwm.po.RPG;

public enum Rasa_istoty {
        czlowiek(true),
        ork(true),
        elf(true),
        krasnolud(true),
        zwierze(false);

        boolean humanoidalny;

        private Rasa_istoty(boolean czy_humanoidalny){
                humanoidalny=czy_humanoidalny;
        }
}
