package api.test;

import org.testng.annotations.Test;

import api.smartsender.io.UpdateContactData;
import settings.SSL;

public class UpdateContactDataTest {


    @Test(invocationCount = 1, threadPoolSize = 1)
    public void UpdateContactData() throws Exception {

        new SSL().SSL();

        UpdateContactData obj = new UpdateContactData();

        String url = "https://api.smartsender.io/v3/contacts/update";
        String json = "{\n" +
                "  \"contactListId\": \"635a8b6d890ede6aae47b662\",\n" +
                "  \"upsert\": false,\n" +
                "  \"contacts\": [\n" +
                "    {\n" +
                "      \"contact\": \"+380635859696\",      \n" +
                "      \"name\": \"John Doe1\",\n" +
                "      \"email\": \"user@example.com\",\n" +
                "      \"phoneNumber\": \"+380635859696\",\n" +
                "      \"userId\": \"1111111\",\n" +
                "      \"active\": true,\n" +
                "      \"emailSubscribe\": true,\n" +
                "      \"smsSubscribe\": true,\n" +
                "      \"desktopWebPushSubscribe\": true,\n" +
                "      \"mobileWebPushSubscribe\": true,\n" +
                "      \"telegramSubscribe\": true,\n" +
                "      \"firstName\": \"John\",\n" +
                "      \"lastName\": \"Doe\",\n" +
                "      \"contactBirthday\": \"1990-01-01\",\n" +
                "      \"contactLanguage\": \"en\",\n" +
                "      \"contactGender \": 2,\n" +
                "      \"contactTimezone\": \"Europe/Tallinn\",\n" +
                "      \"contactScore\": 100,\n" +
                //"      \"avatarLink\": \"img.smartsender.io/g/06c38b4568.jpg\",\n" +
                //"      \"facebookLink\": \"facebook.com/smartsender.io\",\n" +
                //"      \"instagramLink\": \"instagram.com/smartsender\",\n" +
                //"      \"linkedInLink\": \"linkedin.com/company/smartsender\",\n" +
                //"      \"twitterLink\": \"twitter.com/smart_sender\",\n" +
                //"      \"tiktokLink\": \"tiktok.com/smartsender\",\n" +
                //"      \"sourceId\": \"635a8a4e890edeb55564f435\",\n" +
                //"      \"customerSourceId\": \"Customer_Source_ID_From_Your_Platform\",\n" +
                "      \"cac\": {\n" +
                "        \"value\": \"2.05\",\n" +
                "        \"currency\": \"USD\"\n" +
                "      },\n" +
                "      \"variables\": [\n" +
                //"        {\n" +
                //"          \"name\": \"newVariableName\",\n" +
                //"          \"value\": \"newVariableValue\"\n" +
                //"        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        obj.sendPost(url, json);
    }
}
