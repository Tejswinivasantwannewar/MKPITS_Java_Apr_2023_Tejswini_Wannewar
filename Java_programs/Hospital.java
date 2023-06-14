
class Hospital{
List <Rooms> rooms;
Double area;
HospitalType hospitalType;
}

class Rooms{
Double height;
Double width;
Double length;
RoomTypes roomTypes;
}
class Floor extends Hospital{
string FloorName;
FloorType floorType;
string HospitalName;
Integer FloorNo;
}

