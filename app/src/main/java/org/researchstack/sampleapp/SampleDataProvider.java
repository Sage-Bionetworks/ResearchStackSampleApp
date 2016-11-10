package org.researchstack.sampleapp;

import android.content.Context;

import org.researchstack.backbone.result.TaskResult;
import org.sagebionetworks.bridge.researchstack.BridgeDataProvider;

public class SampleDataProvider extends BridgeDataProvider {
  public SampleDataProvider() {
    super(BuildConfig.STUDY_BASE_URL, BuildConfig.STUDY_ID, "PLACEHOLDER",
        new SampleResourceManager.PemResource("assets/bridge_key.pem"));
  }

  @Override
  public void processInitialTaskResult(Context context, TaskResult taskResult) {
    // handle result from initial task (save profile info to disk, upload to your server, etc)
  }
}
