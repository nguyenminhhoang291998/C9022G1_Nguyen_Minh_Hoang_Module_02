package case_study.furama_resort.models.facility;

public class Villa extends Facility{
   private String roomStandards;
   private float poolArea;
   private int floorCount;

   public Villa(String idFacility, String nameFacility, float usableArea, float rentalCosts, int maximumNumberOfPeople,
                String typeHire, String roomStandards, float poolArea, int floorCount) {
      super(idFacility, nameFacility, usableArea, rentalCosts, maximumNumberOfPeople, typeHire);
      this.roomStandards = roomStandards;
      this.poolArea = poolArea;
      this.floorCount = floorCount;
   }

   public String getRoomStandards() {
      return roomStandards;
   }

   public void setRoomStandards(String roomStandards) {
      this.roomStandards = roomStandards;
   }

   public float getPoolArea() {
      return poolArea;
   }

   public void setPoolArea(int poolArea) {
      this.poolArea = poolArea;
   }

   public int getFloorCount() {
      return floorCount;
   }

   public void setFloorCount(int floorCount) {
      this.floorCount = floorCount;
   }

   @Override
   public String toString() {
      return super.toString()+
              ", room Standards='" + roomStandards + '\'' +
              ", pool Area=" + poolArea + "m2" +
              ", floor Count=" + floorCount +
              " }, times of used: " ;
   }
   public StringBuilder writeInfor(){
      return super.writeInfor().append(",").append(this.roomStandards).append(",").
              append(this.poolArea).append(",").append(this.floorCount);
   }
}
