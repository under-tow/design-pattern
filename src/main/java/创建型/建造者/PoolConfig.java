package 创建型.建造者;

import cn.hutool.core.util.StrUtil;

public class PoolConfig {


    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    public PoolConfig(Builder builder) {
        name = builder.name;
        maxTotal = builder.DEFAULT_MAX_TOTAL;
        maxIdle = builder.DEFAULT_MAX_IDLE;
        minIdle = builder.DEFAULT_MIN_IDLE;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public PoolConfig build() {
            if (StrUtil.isBlank(name)) {
                throw new IllegalArgumentException();
            }
            if (maxIdle > maxIdle) {
                throw new IllegalArgumentException();
            }
            if (minIdle > maxIdle || minIdle > maxTotal) {
                throw new IllegalArgumentException();
            }
            return new PoolConfig(this);
        }

        public Builder setName(String name) {
            if (StrUtil.isBlank(name)) {
                throw new IllegalArgumentException();
            }
            this.name = name;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle <= 0) {
                throw new IllegalArgumentException();
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException();
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle <= 0) {
                throw new IllegalArgumentException();
            }
            this.minIdle = minIdle;
            return this;
        }

    }


}
