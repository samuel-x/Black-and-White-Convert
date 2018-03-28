import java.util.ArrayList;
import java.util.HashMap;

public final class EffectLibrary {

    private static HashMap<String, Effect> EFFECTS = new HashMap<>();

    private EffectLibrary() {
        EFFECTS = new HashMap<>();
    }

    public static boolean registerEffect(String name, Effect effect) {
        try {
            EFFECTS.put(name, effect);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static boolean deregisterEffect(String name) {
        try {
            EFFECTS.remove(name);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static Effect getEffect(String name) {
        return EFFECTS.get(name);
    }

    public static ArrayList<String> availableEffects() {
        ArrayList<String> lib = new ArrayList<>();
        for (String effectName : EFFECTS.keySet()) {
            lib.add(effectName);
        }
        return lib;
    }


}
