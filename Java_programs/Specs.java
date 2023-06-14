class Specs{
List <Lense> lense;
SpecsTypes specsTypes;
}

class Lense{
float width;
float height;
LenseType lenseType;
}

class bridge{
float width;
BridgeType bridgeType;
}

class Frame{
float width;
FrameType frameType;
}

class Temple{
float length;
TempleType templeType;
}

class Company extends Lense{
CompanyType comapnayType;
List <CompanyName> companyName;
}



