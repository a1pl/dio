package me.mioclient.mixin;

import me.mioclient.m$$1UPCQC7CcGmQdaRUWp6FSUpxg0xqIpqFDKzDkLOCu7QTfX79smcRCTUQnjDAaFSGLxL1dUkBOgJCLLEMmmz0KefUhlA6VVWBU;
import me.mioclient.m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh;
import me.mioclient.m$$U06wAdbal9c2tydaZHi7748TVcVwW2bZgovjk7GFooaETKTiOhGg9yB0lZ1Y8aexU4VR3M8NH2waRfLg74cum1hWwGVHrgrQm;
import net.minecraft.class_303;
import net.minecraft.class_5481;
import net.minecraft.class_7469;
import net.minecraft.class_7591;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_303.class_7590.class})
public class m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x
implements m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh {
    @Unique
    private m$$1UPCQC7CcGmQdaRUWp6FSUpxg0xqIpqFDKzDkLOCu7QTfX79smcRCTUQnjDAaFSGLxL1dUkBOgJCLLEMmmz0KefUhlA6VVWBU progress = null;
    @Unique
    private class_7469 signature;
    @Mutable
    @Final
    @Shadow
    private class_5481 comp_896;
    @Unique
    private long m$$qtpdMhw2QlSmCHxorxwgF6r42fzxc39tGpqEUu6AYtSnEhUSsUW8rmA5qHGTxhzR0G72uLnBdFuHnO6kryAFghi7OxJn6VmFo;

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(int n, class_5481 class_54812, class_7591 class_75912, boolean bl, CallbackInfo callbackInfo) {
        this.getProgress().m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2(false, 1443322430);
        this.m$$qtpdMhw2QlSmCHxorxwgF6r42fzxc39tGpqEUu6AYtSnEhUSsUW8rmA5qHGTxhzR0G72uLnBdFuHnO6kryAFghi7OxJn6VmFo = System.currentTimeMillis();
    }

    @Override
    public class_7469 getSignature() {
        return this.signature;
    }

    @Override
    public void setSignature(class_7469 class_74692) {
        this.signature = class_74692;
    }

    @Override
    public class_5481 getContent() {
        return this.comp_896;
    }

    @Override
    public void setContent(class_5481 class_54812) {
        this.comp_896 = class_54812;
    }

    @Override
    public m$$1UPCQC7CcGmQdaRUWp6FSUpxg0xqIpqFDKzDkLOCu7QTfX79smcRCTUQnjDAaFSGLxL1dUkBOgJCLLEMmmz0KefUhlA6VVWBU getProgress() {
        if (this.progress == null) {
            this.progress = new m$$1UPCQC7CcGmQdaRUWp6FSUpxg0xqIpqFDKzDkLOCu7QTfX79smcRCTUQnjDAaFSGLxL1dUkBOgJCLLEMmmz0KefUhlA6VVWBU(() -> Float.valueOf(((Float)m$$U06wAdbal9c2tydaZHi7748TVcVwW2bZgovjk7GFooaETKTiOhGg9yB0lZ1Y8aexU4VR3M8NH2waRfLg74cum1hWwGVHrgrQm.m$$29Lf3LIJM0BIYdZNzwHHpCtbtuWE6TKZsQbOHcp8MztNBmIlN4icuATGJ6RxebOAEk5Gv9G01OB50h3AGhy58sQLC7x6wm6Z0((int)-1873515345).m$$n6wBBbLaDkGJjoSpsKVN9W426HR5wqlRH4qpd26jYTEBTtGuTnMxogBCuxFgtCN05oAIg2Ee822vkI1UyLngGhKr9BZPt47GN.getValue()).floatValue() * 2.0f), true);
        }
        return this.progress;
    }

    @Override
    public long mio$getAddTime() {
        return this.m$$qtpdMhw2QlSmCHxorxwgF6r42fzxc39tGpqEUu6AYtSnEhUSsUW8rmA5qHGTxhzR0G72uLnBdFuHnO6kryAFghi7OxJn6VmFo;
    }

    @Override
    public void mio$setAddTime(long l) {
        this.m$$qtpdMhw2QlSmCHxorxwgF6r42fzxc39tGpqEUu6AYtSnEhUSsUW8rmA5qHGTxhzR0G72uLnBdFuHnO6kryAFghi7OxJn6VmFo = l;
    }
}

