# GUI Compatibility Utils

### *making ui mods compatible since 2025!*
**Mods**:
- [Create](https://modrinth.com/mod/create): panorama;
- [Blue Skies](https://modrinth.com/mod/blue-skies): panorama and `options_background.png`;
- [Panorama Creator](https://www.curseforge.com/minecraft/mc-mods/panorama-creator) and other panorama mods like *SWDTeam*'s [Panorama](https://modrinth.com/mod/swd-panorama);
- [Back Math](https://github.com/isabellawoods/Back-Math): don't know why I put it on the list.

---

Currently there's a few ways the panorama can change with other mods (that I found):
- **Create**: the "home" screen resets the panorama, making the rotation between the main menu and other screens
inconsistent;
- **Blue Skies**: replaces the `MainMenuScreen.CUBE_MAP` and `MainMenuScreen.panorama` fields directly with the access transformers --
works by default with this system;
  - `SkiesClientEvents.setNewPanorama()` also replaces the backgrounds but this mod doesn't use the default
`options_background.png` file;
- **Panorama Creator**: same as Blue Skies, but it still replaces the `MainMenuScreen#CUBE_MAP` even if there's no panoramas available (`PanoramaClientEvents.setRandomPanorama(@Nullable MainMenuScreen)`);
- **Configured**: the config screens render twice, causing the panorama to spin twice as fast;
- **Cloth Config API**: uses a custom system altogether to render the backgrounds, making all my code ineffective;

> **author** ~isa 17-5-25