**NoBoatFallDamage**

NoBoatFallDamage is a Minecraft plugin that prevents players from taking fall damage while riding in boats. This plugin provides a more enjoyable and safe experience for players who frequently use boats for travel, exploration, or gameplay. It also allows server administrators to configure certain heights where fall damage will be ignored, giving them control over the gameplay experience.


**Features**

No Fall Damage in Boats
Players will not take fall damage while riding in boats, ensuring a smoother and safer experience when navigating large bodies of water or traveling on boats.

**Configurable Excluded Heights**

Customize which heights should have fall damage suppressed. By modifying the configuration file, administrators can specify different heights where fall damage will not occur.

**Command to Reload Configuration**

The plugin supports a simple command to reload its configuration:
`/noboatfalldamage` reload

**Permissions for Command Usage**

Server admins can control who has access to the reload command by using the permission:
`noboatfalldamage.reload` (default: op).

**Installation**

Download the NoBoatFallDamage plugin .jar file.
Place the .jar file in your server's plugins folder.
Restart or reload your server.
(Optional) Edit the config.yml file to adjust the heights where fall damage is ignored.


**Configuration**

The plugin comes with a configuration file config.yml where you can define the heights at which fall damage should be ignored. Here’s an example of the configuration:

**Commands**

`/noboatfalldamage reload`: Reloads the plugin configuration.

**Aliases:**

`nbfd`, `noboatfall`, `boatfalldmg`, `noboatdmg`, `boatfalldamage`

**Permissions**

`noboatfalldamage.reload`: Allows a user to reload the plugin’s configuration.

Default permission: op


**Usage**

Once the plugin is installed and running, players riding in boats will no longer take fall damage, making boat travel safer. Admins can customize this behavior via the configuration file and reload it dynamically with the `/noboatfalldamag`e reload command.

**Why Use NoBoatFallDamage?**

Improves Player Experience: Prevents frustration for players who enjoy traveling via boat.
Highly Configurable: Fine-tune the plugin to fit your server’s needs by adjusting which heights should trigger fall damage.
Simple to Use: Easy installation and configuration with a simple command for reloading settings.

**Contributing**
We welcome contributions! If you'd like to contribute to NoBoatFallDamage, feel free to fork the repository and submit a pull request. Whether it's bug fixes, new features, or documentation improvements, your help is appreciated.

**How to Contribute:**

Fork the repository.
Create a new branch for your changes.
Make your changes and test them.
Submit a pull request describing the changes you've made.
License
NoBoatFallDamage is open-source and licensed under the MIT License.
