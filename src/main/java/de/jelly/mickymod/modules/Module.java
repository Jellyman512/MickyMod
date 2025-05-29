package de.jelly.mickymod.modules;

import de.jelly.mickymod.MickyMod;

public abstract class Module {

    private boolean running;
    private final String displayName;
    private final String id;
    private final String group;

    public Module(String displayName, String id, String group) {
        this.displayName = displayName;
        this.id = id;
        this.group = group;
    }

    public void start(){
        MickyMod.LOGGER.info("Module " + displayName + " Started with id \"" + id + "\"");
        running = true;
        onStart();
    }

    public void stop(){
        MickyMod.LOGGER.info("Module " + displayName + " Stoped with id \"" + id + "\"");
        running = false;
        onStop();
    }

    public boolean isRunning() {return running;}

    public abstract void onStart();
    public abstract void onStop();

    public String getDisplayName() {return displayName;}
    public String getId() {return id;}
    public String getGroup() {return group;}

}
