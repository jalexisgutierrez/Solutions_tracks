class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake ? false : true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake && archerIsAwake &&  prisonerIsAwake) ? true : !(knightIsAwake || archerIsAwake || prisonerIsAwake) ? false : true;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (archerIsAwake && prisonerIsAwake) ? false : prisonerIsAwake ? true : false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(!knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent) return true;
        return (knightIsAwake && archerIsAwake || !petDogIsPresent) ? false : (archerIsAwake && petDogIsPresent) ? false : true;
    }
}
