package de.jelly.mickymod.modules;

public class TestModule extends Module{

    public TestModule() {
        super("TestModule", "test-module", "modules") ;
    }

    @Override
    public void onStart() {
        System.out.println("Custonm dinge machen");
    }

    @Override
    public void onStop() {
        System.out.println("Custonm dinge am ende machen");
    }

}
