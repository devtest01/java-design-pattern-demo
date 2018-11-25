package com.test.demo;

public enum TextEnum {

    CONV_half(new TextConvert<String>()
    {
        @Override
        public String convert(Object... args) throws Exception {
            if(args.length == 0) return null;

            String[] str = new String[args.length];

            System.arraycopy( args,0,str, 0,args.length);

            for (int i = 0; i < args.length; i++) {
                str[i] = (String)args[i] + "-convertedValue";
            }

            return String.join("\n", str);
        }
    });

    private TextConvert<?> textConvert;

    private TextEnum(TextConvert<String> textConvert) {
        this.textConvert = textConvert;
    }

    public TextConvert<?> getTextConvert() {
        return textConvert;
    }
}

@FunctionalInterface
interface TextConvert<Target> {
    public Target  convert(Object... args) throws Exception;
}