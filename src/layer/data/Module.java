package layer.data;

public class Module {
    private final String moduleCode;
    private final String moduleName;
    private final int moduleCredits;

    public Module(String moduleCode, String moduleName, int moduleCredits) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.moduleCredits = moduleCredits;
    }

    public String getModuleCode() {
        return this.moduleCode;
    }

    public String getModuleName(){
        return this.moduleName;
    }

    public int getModuleCredits() {
        return this.moduleCredits;
    }

    @Override
    public int hashCode() {
        int hc = 7;
        hc = 11 * hc
                + (moduleCode == null ? 0 : moduleCode.hashCode());
        return 13 * hc + 19 * moduleCredits;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Module)) {
            return false;
        }
        Module module = (Module) object;
        return (this.getModuleCode() == module.getModuleCode())
                && (this.getModuleName() == module.getModuleName())
                && (this.getModuleCredits() == module.getModuleCredits());
    }

    public String toString() {
        return moduleCode + ", " + moduleName + ", " + moduleCredits;
    }
}
