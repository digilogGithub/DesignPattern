package templateMethod.modify;

class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    Motor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    MotorStatus getMotorStatus() {
        return motorStatus;
    }
    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
