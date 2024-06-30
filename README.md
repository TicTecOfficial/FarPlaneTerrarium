# FarPlaneTerrarium
An attempt to continue and optimize the exprimental/fp2 branch made by Gegy.

![Mount Everest](https://i.imgur.com/vDsopTZ.png)
Mount Everest in its current state. It should work for most if not every other location teleported to.

## Usage
# THIS ASSUMES YOU HAVE DOWNLOADED THE LINKED FARPLANETWO VERSION AND KNOW HOW TO USE TERRARIUM.

When in the start screen go to Options -> Video Settings -> FP2 options -> Change Render Mode from `voxel` to `heightmap`

Whilst in the menu, change the Generator Threads from `11` to `1`. This is to ensure the server does NOT lock up. I'm still trying to find a fix to this issue.

As of currently, the mod can only generate 7* LOD Levels. The generation speed will gradually slow down as each lod level is generated.

(*: More LOD levels CAN be generated but will take a VERY long time.)

To navigate to any real-world location, you can make use of the `geotp` command:

It can be used with latitude & longitude coordinates:
 - `/geotp 27.987746 86.924812`
 
Or it can be used with a place name:
 - `/geotp Mount Everest`
 
Additionally, you can make use of the `geotool` command, which provides various utilities for navigating the world. It provides a UI to display where you currently are, and a UI to teleport to a new location with a map.

## Data Attribution
Terrarium makes use of a large range of data sources which have been reprocessed for the purpose of this mod:
 - [NASADEM: Courtesy NASA/JPL-Caltech](https://lpdaac.usgs.gov/news/release-nasadem-data-products/)
 - [GEBCO Compilation Group (2019): GEBCO 2019 Grid](https://www.gebco.net/data_and_products/gridded_bathymetry_data/)
 - [Land Cover: ESA Climate Change Initiative](https://www.esa-landcover-cci.org/)
 - [SoilGrids: ISRIC World Soil Info](https://soilgrids.org/)
 - [OpenStreetMap Contributors](https://openstreetmap.org/)
 - [WorldClim](https://www.worldclim.org/)
 - [iNaturalist](https://www.inaturalist.org/)
