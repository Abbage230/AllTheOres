package net.allthemods.alltheores.infos;

public class TranslationKey {
    private static final String FORMAT = "%s." + Reference.MOD_ID + ".%s";

    private TranslationKey() {
        // nothing to do
    }

    public static String tooltip(String key) {
        return String.format(FORMAT, "tooltip", key);
    }

    public static String block(String key) {
        return String.format(FORMAT, "block", key);
    }

    public static String item(String key) {
        return String.format(FORMAT, "item", key);
    }

    public static String gui(String key) {
        return String.format(FORMAT, "gui", key);
    }

    public static String tab() {
        return String.format("itemGroup.%s", Reference.MOD_ID);
    }


    public static String tab2() {
        return String.format("itemGroup.%s", Reference.MOD_ID_MEK);
    }

    public static String jei(String key) {
        return String.format(Reference.MOD_ID + ".int.jei.category.%s", key);
    }

    public static String chat(String key) {
        return String.format(FORMAT, "chat", key);
    }
}