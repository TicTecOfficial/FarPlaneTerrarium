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

# TODO
- Figure out some way to let Terrarium load data at a lower resolution for lower level tiles.
- Fix tps lockup at some point
- i've got nothing else for now because the above should theoretically already make everything work
