# Default Creative

This is a simple plugin that makes creative the default game mode when making a new game.

This branch (`1.20.1`) targets **Minecraft 1.20.1** and is a multi-loader build for both
**Forge** and **Fabric**, using [Architectury](https://docs.architectury.dev/).

When you open the **Create New World** screen, the game mode is defaulted to **Creative**.
You can still switch it back to Survival/Hardcore before creating the world.

## Building

```bash
./gradlew build
```

The built jars are placed in:

- `fabric/build/libs/` — Fabric jar
- `forge/build/libs/` — Forge jar

Use the jar **without** the `-dev` / `-sources` classifier.

## License

Licensed under the [GNU General Public License v3.0](LICENSE).
