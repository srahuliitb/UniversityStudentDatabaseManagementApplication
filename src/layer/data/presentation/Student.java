package layer.data.presentation;

import layer.data.Module;

import java.util.List;

public interface Student {
    String getID();

    String getType();

    List<Module> getRegisteredModules();

    boolean isRegistered();

    String getSupervisor();

}
