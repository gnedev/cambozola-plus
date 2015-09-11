#Cross-platform Webcam viewer with multicam layouts

# Introduction #

CambozolaPlus is extended version of popular java project for webcam viewer.
New features allow view of many cameras in one applet or application as well as other improvements which makes solution for enterprise wide surveillance solutions.


# Details #
Cambozola is great small project which is very popular for software projects working with cameras. However if the system is larger (with more than 10 cameras) using Cambozola as player in browser is practically impossible - due to lack of performance or other limitations.
Cambozola starts one applet for each camera that should be shown, which push the browser to load java plugin many times - one for each camera.
Current project removes this limitations with special attention to keep application smaller and faster.
CambozolaPlus allows users to view more cameras in single screen using not powerful PC.
It is extend cambozola from single view to multiple camera view. As application it is started as single java process and in browser as single applet for all cameras which should be shown - optimizing used resources (RAM and CPU).
Out of this core part it is adding functionality to manage cameras view panels in grid layout as well as other cosmetic options - naming cameras, reordering grids, color and position of titles and etc.

Added functionality:
  * Shows many cameras in one applet/application
  * Shows cameras from different vendors in common view
  * Managing player screens in grid layout
  * Set grid layout for best view (2x2, 4x3, 5x5 etc.)
  * Set title of each camera (Name, Color, Position)
  * Show performance of each stream FPS (Frames per second)
  * Added controls of the FOSCAM cameras (PTZ, Zoom)
  * Read settings and camera list from file (local or from web)
  * New icons added
  * Automatic rounds list of cameras
  * Optimized java archive using obfuscation (about 20% smaller)

Some of the practical use cases which are enabled by CambozolaPlus are described in section "CambozolaPlus in Real Live"