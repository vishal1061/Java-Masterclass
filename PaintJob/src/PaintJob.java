public class PaintJob {

    public static int getBucketCount(double width,double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets <0){
            return -1;
        }else{
            double area = height*width;
            double noOfBuckets = area / areaPerBucket;
            noOfBuckets = noOfBuckets - extraBuckets;
            noOfBuckets = Math.ceil(noOfBuckets);
            return (int) noOfBuckets;
        }
    }

    public static int getBucketCount(double width,double height, double areaPerBucket){

        if(width<=0 || height<=0 || areaPerBucket<=0 ){
            return -1;
        }else{
            double area = height*width;
            double noOfBuckets = area / areaPerBucket;
            noOfBuckets = Math.ceil(noOfBuckets);
            return (int) noOfBuckets;
        }

    }

    public static int getBucketCount(double area, double areaPerBucket){

        if(area<=0 || areaPerBucket<=0 ){
            return -1;
        }else{

            double noOfBuckets = area / areaPerBucket;
            noOfBuckets = Math.ceil(noOfBuckets);
            return (int) noOfBuckets;
        }

    }
}
