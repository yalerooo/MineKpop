
package net.mcreator.minekpop.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CookyBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public CookyBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SPORE_BLOSSOM).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default ->
				Shapes.or(box(8, 0, 5, 11, 2, 11), box(4, 0, 5, 7, 2, 11), box(4, 2, 5, 11, 3, 8), box(4, 3, 5, 14, 7, 8), box(0, 5, 5, 4, 11, 8), box(3, 7, 3, 12, 14, 10), box(9, 14, 5, 12, 18, 8), box(3, 14, 5, 6, 19, 8), box(6, 1, 3, 9, 3, 5));
			case NORTH -> Shapes.or(box(5, 0, 5, 8, 2, 11), box(9, 0, 5, 12, 2, 11), box(5, 2, 8, 12, 3, 11), box(2, 3, 8, 12, 7, 11), box(12, 5, 8, 16, 11, 11), box(4, 7, 6, 13, 14, 13), box(4, 14, 8, 7, 18, 11), box(10, 14, 8, 13, 19, 11),
					box(7, 1, 11, 10, 3, 13));
			case EAST -> Shapes.or(box(5, 0, 5, 11, 2, 8), box(5, 0, 9, 11, 2, 12), box(5, 2, 5, 8, 3, 12), box(5, 3, 2, 8, 7, 12), box(5, 5, 12, 8, 11, 16), box(3, 7, 4, 10, 14, 13), box(5, 14, 4, 8, 18, 7), box(5, 14, 10, 8, 19, 13),
					box(3, 1, 7, 5, 3, 10));
			case WEST -> Shapes.or(box(5, 0, 8, 11, 2, 11), box(5, 0, 4, 11, 2, 7), box(8, 2, 4, 11, 3, 11), box(8, 3, 4, 11, 7, 14), box(8, 5, 0, 11, 11, 4), box(6, 7, 3, 13, 14, 12), box(8, 14, 9, 11, 18, 12), box(8, 14, 3, 11, 19, 6),
					box(11, 1, 6, 13, 3, 9));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
