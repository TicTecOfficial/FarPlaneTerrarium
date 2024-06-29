# FarPlaneTerrarium
An attempt to continue and optimize the exprimental/fp2 branch made by Gegy.

![Mount Everest](https://i.imgur.com/vDsopTZ.png)

## Usage
Terrarium implements a new world type for this generation. The generation can be customized through a GUI, to adjust settings such as scale or what should generate.

![Customization GUI](https://i.imgur.com/5UpsVpA.png)

GIS data is downloaded as you explore the world, so, depending on internet speed, you may experience lag while this data downloads. The mod does its best to counteract this lag, however. Once a part of the dataset is downloaded, it is cached locally so that it can be loaded again quickly in the future.

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
