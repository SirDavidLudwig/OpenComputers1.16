package li.cil.oc

import li.cil.oc.util.ItemUtils

object Constants {

  object BlockName {
    final val AccessPoint = "accessPoint"
    final val Adapter = "adapter"
    final val Assembler = "assembler"
    final val Cable = "cable"
    final val Capacitor = "capacitor"
    final val CaseCreative = "caseCreative"
    final val CaseTier1 = "case1"
    final val CaseTier2 = "case2"
    final val CaseTier3 = "case3"
    final val ChameliumBlock = "chameliumBlock"
    final val Charger = "charger"
    final val Disassembler = "disassembler"
    final val DiskDrive = "diskDrive"
    final val Endstone = "endstone"
    final val Geolyzer = "geolyzer"
    final val HologramTier1 = "hologram1"
    final val HologramTier2 = "hologram2"
    final val Keyboard = "keyboard"
    final val Microcontroller = "microcontroller"
    final val MotionSensor = "motionSensor"
    final val PowerConverter = "powerConverter"
    final val PowerDistributor = "powerDistributor"
    final val Print = "print"
    final val Printer = "printer"
    final val Raid = "raid"
    final val Redstone = "redstone"
    final val Robot = "robot"
    final val RobotAfterimage = "robotAfterimage"
    final val ScreenTier1 = "screen1"
    final val ScreenTier2 = "screen2"
    final val ScreenTier3 = "screen3"
    final val ServerRack = "serverRack"
    final val Switch = "switch"
    final val Waypoint = "waypoint"

    def Case(tier: Int) = ItemUtils.caseNameWithTierSuffix("case", tier)
  }

  object ItemName {
    final val AbstractBusCard = "abstractBusCard"
    final val Acid = "acid"
    final val Alu = "alu"
    final val Analyzer = "analyzer"
    final val AngelUpgrade = "angelUpgrade"
    final val APUTier1 = "apu1"
    final val APUTier2 = "apu2"
    final val ArrowKeys = "arrowKeys"
    final val BatteryUpgradeTier1 = "batteryUpgrade1"
    final val BatteryUpgradeTier2 = "batteryUpgrade2"
    final val BatteryUpgradeTier3 = "batteryUpgrade3"
    final val ButtonGroup = "buttonGroup"
    final val Card = "card"
    final val CardContainerTier1 = "cardContainer1"
    final val CardContainerTier2 = "cardContainer2"
    final val CardContainerTier3 = "cardContainer3"
    final val Chamelium = "chamelium"
    final val ChipTier1 = "chip1"
    final val ChipTier2 = "chip2"
    final val ChipTier3 = "chip3"
    final val ChunkloaderUpgrade = "chunkloaderUpgrade"
    final val CircuitBoard = "circuitBoard"
    final val ComponentBusTier1 = "componentBus1"
    final val ComponentBusTier2 = "componentBus2"
    final val ComponentBusTier3 = "componentBus3"
    final val CPUTier1 = "cpu1"
    final val CPUTier2 = "cpu2"
    final val CPUTier3 = "cpu3"
    final val CraftingUpgrade = "craftingUpgrade"
    final val ControlUnit = "cu"
    final val CuttingWire = "cuttingWire"
    final val DatabaseUpgradeTier1 = "databaseUpgrade1"
    final val DatabaseUpgradeTier2 = "databaseUpgrade2"
    final val DatabaseUpgradeTier3 = "databaseUpgrade3"
    final val DebugCard = "debugCard"
    final val Debugger = "debugger"
    final val Disk = "disk"
    final val Drone = "drone"
    final val DroneCaseCreative = "droneCaseCreative"
    final val DroneCaseTier1 = "droneCase1"
    final val DroneCaseTier2 = "droneCase2"
    final val EEPROM = "eeprom"
    final val ExperienceUpgrade = "experienceUpgrade"
    final val Floppy = "floppy"
    final val GeneratorUpgrade = "generatorUpgrade"
    final val GraphicsCardTier1 = "graphicsCard1"
    final val GraphicsCardTier2 = "graphicsCard2"
    final val GraphicsCardTier3 = "graphicsCard3"
    final val HDDTier1 = "hdd1"
    final val HDDTier2 = "hdd2"
    final val HDDTier3 = "hdd3"
    final val HoverUpgradeTier1 = "hoverUpgrade1"
    final val HoverUpgradeTier2 = "hoverUpgrade2"
    final val InkCartridgeEmpty = "inkCartridgeEmpty"
    final val InkCartridge = "inkCartridge"
    final val InternetCard = "internetCard"
    final val Interweb = "interweb"
    final val InventoryControllerUpgrade = "inventoryControllerUpgrade"
    final val InventoryUpgrade = "inventoryUpgrade"
    final val IronNugget = "nuggetIron"
    final val LeashUpgrade = "leashUpgrade"
    final val LinkedCard = "linkedCard"
    final val LootDisk = "lootDisk"
    final val LuaBios = "luaBios"
    final val Manual = "manual"
    final val MicrocontrollerCaseCreative = "microcontrollerCaseCreative"
    final val MicrocontrollerCaseTier1 = "microcontrollerCase1"
    final val MicrocontrollerCaseTier2 = "microcontrollerCase2"
    final val NavigationUpgrade = "navigationUpgrade"
    final val NetworkCard = "lanCard"
    final val NumPad = "numPad"
    final val OpenOS = "openOS"
    final val PistonUpgrade = "pistonUpgrade"
    final val Present = "present"
    final val PrintedCircuitBoard = "printedCircuitBoard"
    final val RAMTier1 = "ram1"
    final val RAMTier2 = "ram2"
    final val RAMTier3 = "ram3"
    final val RAMTier4 = "ram4"
    final val RAMTier5 = "ram5"
    final val RAMTier6 = "ram6"
    final val RawCircuitBoard = "rawCircuitBoard"
    final val RedstoneCardTier1 = "redstoneCard1"
    final val RedstoneCardTier2 = "redstoneCard2"
    final val ServerCreative = "serverCreative"
    final val ServerTier1 = "server1"
    final val ServerTier2 = "server2"
    final val ServerTier3 = "server3"
    final val SignUpgrade = "signUpgrade"
    final val SolarGeneratorUpgrade = "solarGeneratorUpgrade"
    final val Tablet = "tablet"
    final val TabletCaseCreative = "tabletCaseCreative"
    final val TabletCaseTier1 = "tabletCase1"
    final val TabletCaseTier2 = "tabletCase2"
    final val TankControllerUpgrade = "tankControllerUpgrade"
    final val TankUpgrade = "tankUpgrade"
    final val Terminal = "terminal"
    final val TexturePicker = "texturePicker"
    final val TractorBeamUpgrade = "tractorBeamUpgrade"
    final val Transistor = "transistor"
    final val UpgradeContainerTier1 = "upgradeContainer1"
    final val UpgradeContainerTier2 = "upgradeContainer2"
    final val UpgradeContainerTier3 = "upgradeContainer3"
    final val WirelessNetworkCard = "wlanCard"
    final val WorldSensorCard = "worldSensorCard"
    final val Wrench = "wrench"

    def DroneCase(tier: Int) = ItemUtils.caseNameWithTierSuffix("droneCase", tier)

    def MicrocontrollerCase(tier: Int) = ItemUtils.caseNameWithTierSuffix("microcontrollerCase", tier)

    def TabletCase(tier: Int) = ItemUtils.caseNameWithTierSuffix("tabletCase", tier)
  }

}
