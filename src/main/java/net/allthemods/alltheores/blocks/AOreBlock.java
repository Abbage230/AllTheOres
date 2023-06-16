package net.allthemods.alltheores.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;

public class AOreBlock extends DropExperienceBlock {

	public AOreBlock(float strength1, float strength2) {
		super(Block.Properties.of().requiresCorrectToolForDrops().sound((strength1 > 3.0f) ? SoundType.DEEPSLATE : SoundType.STONE)
					.strength(strength1,strength2));

	}


}
