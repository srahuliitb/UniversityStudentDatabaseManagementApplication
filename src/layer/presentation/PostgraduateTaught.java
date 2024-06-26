package layer.presentation;

import layer.data.Module;

import java.util.ArrayList;
import java.util.List;

public class PostgraduateTaught implements Student {
    private final String ID;
    private final List<Module> registeredModules;
    private static final int REQUIRED_CREDITS = 180;

    public PostgraduateTaught(String ID) {
        this.ID = ID;
        this.registeredModules = new ArrayList<>();
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getType() {
        return "PGT";
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
        return ""; // Postgraduate taught students do not have supervisors
    }

    public void registerModule(Module module) {
        registeredModules.add(module);
    }
}
