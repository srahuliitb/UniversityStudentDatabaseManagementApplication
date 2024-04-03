package layer.presentation;

import java.util.ArrayList;
import java.util.List;
import layer.data.Module;

public class Undergraduate implements Student {
    private final String ID;
    private final List<Module> registeredModules;
    private static final int REQUIRED_CREDITS = 120;

    public Undergraduate(String ID) {
        this.ID = ID;
        this.registeredModules = new ArrayList<>();
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getType() {
        return "UG";
    }

    @Override
    public List<Module> getRegisteredModules() {
        return registeredModules;
    }

    @Override
    public boolean isRegistered() {
        int totalCredits = registeredModules.stream().mapToInt(Module::getModuleCredits).sum();
        return totalCredits >= REQUIRED_CREDITS;
    }

    @Override
    public String getSupervisor() {
        return ""; // Undergraduates do not have supervisors
    }

    public void registerModule(Module module) {
        registeredModules.add(module);
    }
}
