package layer.presentation;

import layer.data.Module;

import java.util.ArrayList;
import java.util.List;

public class PostgraduateResearch implements Student {
    private final String ID;
    private final String supervisor;

    public PostgraduateResearch(String ID, String supervisor) {
        this.ID = ID;
        this.supervisor = supervisor;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getType() {
        return "PGR";
    }

    @Override
    public List<Module> getRegisteredModules() {
        return new ArrayList<>(); // Postgraduate research students do not register for modules
    }

    @Override
    public boolean isRegistered() {
        return true; // Postgraduate research students are always registered
    }

    @Override
    public String getSupervisor() {
        return supervisor;
    }
}
