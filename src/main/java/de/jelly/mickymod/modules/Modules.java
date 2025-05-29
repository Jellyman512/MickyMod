package de.jelly.mickymod.modules;

import java.util.HashMap;
import java.util.Map;

public class Modules {
    private static Map<String, Module> modules = new HashMap<>();

    public static Module getModule(String id) {
        return modules.get(id);
    }

    public static Module addModule(Module module) {
        return instances.put(module.getId(), module);
    }

    

}
