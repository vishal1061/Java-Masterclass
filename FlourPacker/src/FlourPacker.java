public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (bigCount<0 || smallCount <0 || goal < 0){
            return false;

        }else{
            int tempBigCount = bigCount*5;
            int tempGoal;

            if (tempBigCount <= goal){
                tempGoal = goal - tempBigCount;
                if(smallCount>=tempGoal){
                    return true;
                }else{
                    return false;
                }


            }else{
                tempGoal = tempBigCount % goal;
                if(tempGoal !=0){

                    tempGoal = 5-tempGoal;
                    if(smallCount>=tempGoal){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }

            }

        }
    }
}
