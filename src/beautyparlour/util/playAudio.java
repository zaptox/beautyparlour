/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.util;

import java.applet.AudioClip;
import javax.swing.JApplet;

/**
 *
 * @author Vksoni
 */
public class playAudio {
    public void playErrorSound() {
     
        AudioClip error = JApplet.newAudioClip(getClass().getResource("/beautyparlour/audio/error.wav"));
            error.play();
    }
      public void playSuccessSound() {
     
        AudioClip error = JApplet.newAudioClip(getClass().getResource("/beautyparlour/audio/chaching.wav"));
            error.play();
    }
}
