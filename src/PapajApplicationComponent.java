import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class PapajApplicationComponent {
    public PapajApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", PapajProgressBarUi.class.getName());
        UIManager.getDefaults().put(PapajProgressBarUi.class.getName(), PapajProgressBarUi.class);
    }
}
