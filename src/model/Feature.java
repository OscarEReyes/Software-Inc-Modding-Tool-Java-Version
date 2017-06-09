package model;

import javafx.beans.property.*;

/**
 * Class for Feature object
 *
 * Created by Oscar Reyes on 6/8/2017.
 */

public class Feature {
    // Must-Have properties.
    private StringProperty  name;
    private StringProperty  category;
    private StringProperty  description;
    private StringProperty  unlock;
    private IntegerProperty devTime;
    private IntegerProperty innovation;
    private IntegerProperty usability;
    private IntegerProperty stability;
    private FloatProperty  codeArt;
    private FloatProperty  server;

    // Attribute variables
    private StringProperty  from;
    private BooleanProperty forced;
    private BooleanProperty vital;
    private StringProperty  research;


    // Optional Field
    private StringProperty artCategory;

    // Getters

    public String getName()        { return name.get();               }
    public String getCategory()    { return category.get();           }
    public String getDescription() { return description.get();        }
    public String getUnlock()      { return unlock.get();             }
    public byte   getDevTime()     { return (byte) devTime.get();     }
    public byte   getInnovation()  { return (byte) innovation.get();  }
    public byte   getUsability()   { return (byte) usability.get();   }
    public byte   getStability()   { return (byte) stability.get();   }
    public float  getCodeArt()     { return codeArt.get();            }
    public float  getServer()      { return server.get();             }

    // Setters

    public void setName       (String name)        { this.name.set(name);               }
    public void setCategory   (String category)    { this.category.set(category);       }
    public void setDescription(String description) { this.description.set(description); }
    public void setUnlock     (String unlock)      { this.unlock.set(unlock);           }
    public void setDevTime    (byte devTime)       { this.devTime.set(devTime);         }
    public void setInnovation (byte innovation)    { this.innovation.set(innovation);   }
    public void setUsability  (byte usability)     { this.usability.set(usability);     }
    public void setStability  (byte stability)     { this.stability.set(stability);     }
    public void setCodeArt    (float codeArt)      { this.codeArt.set(codeArt);         }
    public void setServer     (float server)       { this.server.set(server);           }

    // Property Getters

    public StringProperty  nameProperty()        { return name;        }
    public StringProperty  categoryProperty()    { return category;    }
    public StringProperty  descriptionProperty() { return description; }
    public StringProperty  unlockProperty()      { return unlock;      }
    public IntegerProperty devTimeProperty()     { return devTime;     }
    public IntegerProperty innovationProperty()  { return innovation;  }
    public IntegerProperty usabilityProperty()   { return usability;   }
    public IntegerProperty stabilityProperty()   { return stability;   }
    public FloatProperty   codeArtProperty()     { return codeArt;     }
    public FloatProperty   serverProperty()      { return server;      }

    public Feature(Feature.FeatureBuilder builder) {
        this.name        = builder.name;
        this.category    = builder.category;
        this.description = builder.description;
        this.unlock      = builder.unlock;
        this.devTime     = builder.devTime;
        this.innovation  = builder.innovation;
        this.usability   = builder.usability;
        this.stability   = builder.stability;
        this.codeArt     = builder.codeArt;
        this.server      = builder.server;
    }

    /**
     *
     * Builder Class for Software Type
     */
    public static class FeatureBuilder {
        private StringProperty  name;
        private StringProperty  category;
        private StringProperty  description;
        private StringProperty  unlock;
        private IntegerProperty devTime;
        private IntegerProperty innovation;
        private IntegerProperty usability;
        private IntegerProperty stability;
        private FloatProperty  codeArt;
        private FloatProperty  server;

        public FeatureBuilder(String name) {
            this.name = new SimpleStringProperty(name);
        }

        public FeatureBuilder category(String category) {
            this.category = new SimpleStringProperty(category);
            return this;
        }

        public FeatureBuilder description(String description) {
            this.description = new SimpleStringProperty(description);
            return this;
        }

        public FeatureBuilder unlock(String year) {
            this.unlock = new SimpleStringProperty(year);
            return this;
        }

        public FeatureBuilder devTime(int months) {
            this.devTime = new SimpleIntegerProperty(months);
            return this;
        }

        public FeatureBuilder innovation(int innov) {
            this.innovation = new SimpleIntegerProperty(innov);
            return this;
        }

        public FeatureBuilder usability(int usability) {
            this.usability = new SimpleIntegerProperty(usability);
            return this;
        }

        public FeatureBuilder stability(int stability) {
            this.stability = new SimpleIntegerProperty(stability);
            return this;
        }

        public FeatureBuilder codeArt(int usability) {
            this.codeArt = new SimpleFloatProperty(usability);
            return this;
        }

        public FeatureBuilder server(int server) {
            this.server = new SimpleFloatProperty(server);
            return this;
        }

        public Feature build() { return new Feature(this); }

    }
}
