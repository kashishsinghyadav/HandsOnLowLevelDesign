public enum Spottype {
    COMPACT, LARGE, BIKE;

    public boolean canFit(VehicleType vehicleType) {
        return (this == COMPACT && vehicleType == VehicleType.CAR)
            || (this == LARGE && vehicleType == VehicleType.TRUCK)
            || (this == BIKE && vehicleType == VehicleType.BIKE);
    }

}
