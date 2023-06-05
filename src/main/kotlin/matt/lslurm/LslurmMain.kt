package matt.lslurm

import matt.fx.control.wrapper.label.label
import matt.fx.graphics.wrapper.pane.vbox.VBoxW
import matt.gui.app.runFXAppBlocking

fun main() = runFXAppBlocking {
    root<VBoxW> {
        label("Hello Local Slurm")
    }
}