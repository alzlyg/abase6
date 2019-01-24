package innobi.ru.townweather.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(createDummyItem(ITEMS.size(), "Москва"));
        addItem(createDummyItem(ITEMS.size(), "Санкт-Петербург"));
        addItem(createDummyItem(ITEMS.size(), "Ростов-на-Дону"));
        addItem(createDummyItem(ITEMS.size(), "Таганрог"));
        addItem(createDummyItem(ITEMS.size(), "Сочи"));
        addItem(createDummyItem(ITEMS.size(), "Геленджик"));
        addItem(createDummyItem(ITEMS.size(), "Кисловодск"));
        addItem(createDummyItem(ITEMS.size(), "Волгодонск"));
        addItem(createDummyItem(ITEMS.size(), "Новочеркасск"));
        addItem(createDummyItem(ITEMS.size(), "Симферополь"));
        addItem(createDummyItem(ITEMS.size(), "Севастополь"));
        addItem(createDummyItem(ITEMS.size(), "Феодосия"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position, String townName) {
        return new DummyItem(String.valueOf(position), townName);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final int temperature;
        public final int wet;
        public final int wind;
        public final int pressure;
        public final int cloudy;
        public final int rain;
        public final int snow;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
            this.temperature = getTemperatureId(id);
            this.wet = getWetId(id);
            this.wind = getWindId(id);
            this.pressure = getPressureId(id);
            this.cloudy = getCloudyId(id);
            this.rain = getRainId(id);
            this.snow = getSnowId(id);
        }

        private int getTemperatureId(String id) {
            int temperature;
            switch (id) {
                case "0":
                    temperature = -12;
                    break;
                case "1":
                    temperature = -8;
                    break;
                case "2":
                    temperature = 4;
                    break;
                case "3":
                    temperature = 3;
                    break;
                case "4":
                    temperature = 11;
                    break;
                case "5":
                    temperature = 6;
                    break;
                case "6":
                    temperature = -1;
                    break;
                case "7":
                    temperature = 1;
                    break;
                case "8":
                    temperature = 3;
                    break;
                case "9":
                    temperature = 6;
                    break;
                case "10":
                    temperature = 8;
                    break;
                case "11":
                    temperature = 6;
                    break;
                default:
                    temperature = 0;
                    break;
            }
            return temperature;
        }


        private int getWetId(String id) {
            int wet;
            switch (id) {
                case "0":
                    wet = 82;
                    break;
                case "1":
                    wet = 84;
                    break;
                case "2":
                    wet = 88;
                    break;
                case "3":
                    wet = 93;
                    break;
                case "4":
                    wet = 87;
                    break;
                case "5":
                    wet = 86;
                    break;
                case "6":
                    wet = 80;
                    break;
                case "7":
                    wet = 93;
                    break;
                case "8":
                    wet = 84;
                    break;
                case "9":
                    wet = 88;
                    break;
                case "10":
                    wet = 90;
                    break;
                case "11":
                    wet = 85;
                    break;
                default:
                    wet = 0;
                    break;
            }
            return wet;
        }


        private int getWindId(String id) {
            int wind;
            switch (id) {
                case "0":
                    wind = 14;
                    break;
                case "1":
                    wind = 12;
                    break;
                case "2":
                    wind = 5;
                    break;
                case "3":
                    wind = 6;
                    break;
                case "4":
                    wind = 9;
                    break;
                case "5":
                    wind = 10;
                    break;
                case "6":
                    wind = 3;
                    break;
                case "7":
                    wind = 4;
                    break;
                case "8":
                    wind = 2;
                    break;
                case "9":
                    wind = 5;
                    break;
                case "10":
                    wind = 7;
                    break;
                case "11":
                    wind = 4;
                    break;
                default:
                    wind = 0;
                    break;
            }
            return wind;
        }

        private int getPressureId(String id) {
            int pressure;
            switch (id) {
                case "0":
                    pressure = 758;
                    break;
                case "1":
                    pressure = 757;
                    break;
                case "2":
                    pressure = 755;
                    break;
                case "3":
                    pressure = 754;
                    break;
                case "4":
                    pressure = 758;
                    break;
                case "5":
                    pressure = 759;
                    break;
                case "6":
                    pressure = 757;
                    break;
                case "7":
                    pressure = 758;
                    break;
                case "8":
                    pressure = 754;
                    break;
                case "9":
                    pressure = 757;
                    break;
                case "10":
                    pressure = 756;
                    break;
                case "11":
                    pressure = 758;
                    break;
                default:
                    pressure = 0;
                    break;
            }
            return pressure;
        }

        private int getCloudyId(String id) {
            int cloudy;
            switch (id) {
                case "0":
                    cloudy = 2;
                    break;
                case "1":
                    cloudy = 1;
                    break;
                case "2":
                    cloudy = 0;
                    break;
                case "3":
                    cloudy = 2;
                    break;
                case "4":
                    cloudy = 1;
                    break;
                case "5":
                    cloudy = 0;
                    break;
                case "6":
                    cloudy = 2;
                    break;
                case "7":
                    cloudy = 1;
                    break;
                case "8":
                    cloudy = 0;
                    break;
                case "9":
                    cloudy = 2;
                    break;
                case "10":
                    cloudy = 1;
                    break;
                case "11":
                    cloudy = 0;
                    break;
                default:
                    cloudy = 0;
                    break;
            }
            return cloudy;
        }

        private int getRainId(String id) {
            int rain;
            switch (id) {
                case "0":
                    rain = 0;
                    break;
                case "1":
                    rain = 0;
                    break;
                case "2":
                    rain = 0;
                    break;
                case "3":
                    rain = 2;
                    break;
                case "4":
                    rain = 1;
                    break;
                case "5":
                    rain = 0;
                    break;
                case "6":
                    rain = 1;
                    break;
                case "7":
                    rain = 0;
                    break;
                case "8":
                    rain = 0;
                    break;
                case "9":
                    rain = 1;
                    break;
                case "10":
                    rain = 0;
                    break;
                case "11":
                    rain = 0;
                    break;
                default:
                    rain = 0;
                    break;
            }
            return rain;
        }

        private int getSnowId(String id) {
            int snow;
            switch (id) {
                case "0":
                    snow = 2;
                    break;
                case "1":
                    snow = 1;
                    break;
                case "2":
                    snow = 0;
                    break;
                case "3":
                    snow = 0;
                    break;
                case "4":
                    snow = 0;
                    break;
                case "5":
                    snow = 0;
                    break;
                case "6":
                    snow = 1;
                    break;
                case "7":
                    snow = 0;
                    break;
                case "8":
                    snow = 0;
                    break;
                case "9":
                    snow = 0;
                    break;
                case "10":
                    snow = 0;
                    break;
                case "11":
                    snow = 0;
                    break;
                default:
                    snow = 0;
                    break;
            }
            return snow;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
