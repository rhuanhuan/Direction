package com.twu.refactoring;

public enum DIRECTION {
    EAST(00),
    WEST(10),
    NORTH(11),
    SOUTH(01);

    private final int directionNum;

    DIRECTION(int directionNum){
        this.directionNum = directionNum;
    }

    public DIRECTION turnRight(){
        return directionRelatedToNumber(directionNum+5);
    }

    private DIRECTION directionRelatedToNumber(int number) {
        for(DIRECTION direction: DIRECTION.values()){
            if(direction.directionNum == getDirectNum(number)){
                return direction;
            }
        }
        return this;
    }

    public DIRECTION turnLeft(){
        return directionRelatedToNumber(directionNum+3);
    }

    private int getDirectNum(int number){
        String numString=Integer.toBinaryString(number).substring(Integer.toBinaryString(number).length()-2);
        try {
            return Integer.valueOf(numString);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return number;
    }
}
