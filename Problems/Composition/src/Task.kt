// write the classes here
data class OperatingSystem(var name:String = "")

data class DualBoot( var primaryOs:OperatingSystem = OperatingSystem("primary"), 
var secondaryOs:OperatingSystem = OperatingSystem("secondary") )
