// 
// Decompiled by Procyon v0.6.0
// 

public final class ova implements ouz
{
    public static final moh a;
    public static final moh b;
    public static final moh c;
    public static final moh d;
    
    static {
        final mof a2 = new mof(mnw.a("com.google.android.apps.camera")).b().a();
        a2.f("SocialShare__enable_social_share", true);
        a = a2.e("SocialShare__use_geolocation_app_ranking", "");
        b = a2.e("SocialShare__use_phenotype_allowlist", "com.facebook.lite/com.facebook.lite.stories.activities.ShareToFbStoriesAlias,com.google.android.apps.googlevoice/com.google.android.apps.voice.home.androidintents.AndroidIntentActivity,com.facebook.mlite/com.facebook.mlite.share.view.ShareActivity,com.facebook.orca/com.facebook.messenger.intents.ShareIntentHandler,com.facebook.katana/com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareDefaultAlias/com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasActionClarify/com.facebook.inspiration.platformsharing.activity.InpirationCameraShareDefaultAlias,com.google.android.apps.messaging/com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity,com.google.android.apps.tachyon/com.google.android.apps.tachyon.clips.share.ReceiveShareIntentActivity,com.instagram.android/com.instagram.share.handleractivity.StoryShareHandlerActivity,com.kakao.talk/com.kakao.talk.activity.SplashConnectActivity,jp.naver.line.android/jp.naver.line.android.activity.selectchat.SelectChatActivityLaunchActivity/com.linecorp.line.share.common.view.FullPickerLaunchActivity,com.snapchat.android/com.snap.mushroom.MainActivity,org.telegram.messenger/org.telegram.ui.LaunchActivity,com.viber.voip/com.viber.voip.WelcomeShareActivity,ua.itaysonlab.messenger/org.telegram.ui.LaunchActivity,com.whatsapp/com.whatsapp.ContactPicker/com.whatsapp.contact.picker.ContactPicker,com.groupme.android/com.groupme.android.sharing.SharingActivity,kik.android/kik.android.chat.activity.KikPlatformLanding,com.skype.raider/com.skype4life.MainActivity,com.discord/com.discord.app.AppActivity$AppAction,org.thoughtcrime.securesms/org.thoughtcrime.securesms.ShareActivity/org.thoughtcrime.securesms.sharing.ShareActivity,com.imo.android.imoim/com.imo.android.imoim.activities.SharingActivity/com.imo.android.imoim.globalshare.SharingActivity2,in.mohalla.sharechat/in.mohalla.sharechat.home.main.HomeActivity,app.buzz.share/com.ss.android.buzz.proxy.MediaIntentReceiveActivity,com.verizon.messaging.vzmsgs/com.verizon.mms.ui.LaunchConversationActivity,com.textra/com.mplus.lib.ui.integration.IntegrationActivity,com.twitter.android/com.twitter.composer.ComposerActivity,com.google.android.talk/com.google.android.apps.hangouts.phone.ShareIntentActivity,com.google.android.apps.dynamite/com.google.android.apps.dynamite.activity.main.MainActivity,com.Slack/com.Slack.ui.UploadActivity,com.vsco.cam/com.vsco.cam.navigation.LithiumActivity");
        c = a2.e("SocialShare__use_phenotype_app_ranking", "com.whatsapp,com.facebook.orca,com.instagram.android,com.facebook.katana,com.facebook.lite,com.snapchat.android,com.facebook.mlite,org.telegram.messenger,app.buzz.share,com.twitter.android,com.imo.android.imoim,com.google.android.youtube,in.mohalla.sharechat,com.discord,com.viber.voip,com.google.android.apps.tachyon,com.skype.raider,jp.naver.line.android,com.google.android.apps.dynamite,com.google.android.talk,com.google.android.apps.messaging,com.vsco.cam,ua.itaysonlab.messenger,com.Slack,com.kakao.talk,org.thoughtcrime.securesms,kik.android,com.groupme.android,com.google.android.apps.googlevoice,com.verizon.messaging.vzmsgs,com.textra");
        d = a2.e("SocialShare__use_phenotype_video_allowlist", "com.facebook.orca/com.facebook.messenger.intents.ShareIntentHandler,com.facebook.katana/com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareDefaultAlias/com.facebook.inspiration.platformsharing.activity.InpirationCameraShareDefaultAlias,com.google.android.apps.messaging/com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity,com.google.android.apps.tachyon/com.google.android.apps.tachyon.clips.share.ReceiveShareIntentActivity,com.instagram.android/com.instagram.share.handleractivity.StoryShareHandlerActivity,com.kakao.talk/com.kakao.talk.activity.SplashConnectActivity,jp.naver.line.android/jp.naver.line.android.activity.selectchat.SelectChatActivityLaunchActivity/com.linecorp.line.share.common.view.FullPickerLaunchActivity,com.snapchat.android/com.snap.mushroom.MainActivity,org.telegram.messenger/org.telegram.ui.LaunchActivity,com.viber.voip/com.viber.voip.WelcomeShareActivity,ua.itaysonlab.messenger/org.telegram.ui.LaunchActivity,com.whatsapp/com.whatsapp.ContactPicker/com.whatsapp.contact.picker.ContactPicker,com.groupme.android/com.groupme.android.sharing.SharingActivity,kik.android/kik.android.chat.activity.KikPlatformLanding,com.skype.raider/com.skype4life.MainActivity,com.discord/com.discord.app.AppActivity$AppAction,org.thoughtcrime.securesms/org.thoughtcrime.securesms.sharing.ShareActivity,com.imo.android.imoim/com.imo.android.imoim.globalshare.SharingActivity2,in.mohalla.sharechat/in.mohalla.sharechat.home.main.HomeActivity,app.buzz.share/com.ss.android.buzz.proxy.MediaIntentReceiveActivity,com.verizon.messaging.vzmsgs/com.verizon.mms.ui.LaunchConversationActivity,com.textra/com.mplus.lib.ui.integration.IntegrationActivity,com.twitter.android/com.twitter.composer.ComposerActivity,com.google.android.talk/com.google.android.apps.hangouts.phone.VideoShareIntentActivity,com.Slack/com.Slack.ui.UploadActivity,com.vsco.cam/com.vsco.cam.navigation.LithiumActivity,com.google.android.youtube/com.google.android.youtube.UploadIntentHandlingActivity/com.google.android.apps.youtube.app.application.Shell_UploadActivity,com.facebook.lite/com.facebook.lite.stories.activities.ShareToFbStoriesAlias");
    }
    
    @Override
    public final String a() {
        return (String)ova.a.e();
    }
    
    @Override
    public final String b() {
        return (String)ova.b.e();
    }
    
    @Override
    public final String c() {
        return (String)ova.c.e();
    }
    
    @Override
    public final String d() {
        return (String)ova.d.e();
    }
}
